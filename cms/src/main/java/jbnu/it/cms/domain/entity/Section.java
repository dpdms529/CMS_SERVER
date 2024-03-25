package jbnu.it.cms.domain.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

import static jakarta.persistence.FetchType.*;

@Entity
@IdClass(SectionPK.class)
@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Section {
    @Id
    @Column(name = "`year`")
    private int year;
    @Id
    private int semester;
    @Id
    private int targetGrade;
    @Id
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name = "courseId", referencedColumnName = "id")
    @ToString.Exclude
    private Course course;
    @ManyToOne
    @JoinColumn(name = "courseClassificationCode", referencedColumnName = "code", nullable = false)
    private CourseClassification courseClassification;
    @Builder.Default
    @OneToMany(mappedBy = "section")
    @ToString.Exclude
    List<Takes> takesList = new ArrayList<>();
}
