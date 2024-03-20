package jbnu.it.cms.domain.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@ToString(of = {"preCourse", "startYear", "endYear"})
@IdClass(PreCoursePK.class)
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class PreCourse {
    @Id
    @ManyToOne
    @JoinColumn(name = "courseId", referencedColumnName = "id")
    private Course course;
    @Id
    @ManyToOne
    @JoinColumn(name = "id", referencedColumnName = "id")
    private Course preCourse;
    @Column(nullable = false)
    private int startYear;
    @Column(nullable = false)
    private int endYear;
}