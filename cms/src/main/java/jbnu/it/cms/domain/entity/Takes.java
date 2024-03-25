package jbnu.it.cms.domain.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@ToString(exclude = {"student", "section", "score"})
@IdClass(TakesPK.class)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Takes {
    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns(
            {
                    @JoinColumn(name = "`year`"),
                    @JoinColumn(name = "semester"),
                    @JoinColumn(name = "target_grade"),
                    @JoinColumn(name = "course_id")
            }
    )
    private Section section;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "student_id", referencedColumnName = "id")
    private Student student;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "gp", nullable = false)
    private Score score;
}
