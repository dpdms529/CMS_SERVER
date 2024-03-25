package jbnu.it.cms.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Builder
@ToString
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class CourseClassification {
    @Id
    private String code;

    @Column(name = "`name`", nullable = false)
    private String name;

    @Builder.Default
    @OneToMany(mappedBy = "courseClassification")
    @ToString.Exclude
    List<Section> sections = new ArrayList<>();
}
