package jbnu.it.cms.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.*;

@Entity
@Data
@IdClass(SectionPK.class)
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Section {
    @Id
    private int sectionYear;
    @Id
    private int sectionSemester;
    @Id
    private int targetGrade;
    @Id
    private String courseId;
    @Column(nullable = false)
    private String courseClassificationCode;
}
