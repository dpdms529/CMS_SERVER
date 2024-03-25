package jbnu.it.cms.domain.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@ToString
@IdClass(TakesPK.class)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Takes {
    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns(
            {
                    @JoinColumn(name = "`year`", referencedColumnName = "`year`"),
                    @JoinColumn(name = "semester", referencedColumnName = "semester"),
                    @JoinColumn(name = "targetGrade", referencedColumnName = "targetGrade"),
                    @JoinColumn(name = "courseId", referencedColumnName = "courseId")
            }
    )
    private Section section;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "studentId", referencedColumnName = "id")
    private Student student;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "gp", nullable = false)
    private Score score;
}
