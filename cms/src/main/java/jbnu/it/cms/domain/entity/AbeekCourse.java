package jbnu.it.cms.domain.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@IdClass(AbeekCoursePK.class)
@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class AbeekCourse {
    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "courseId", referencedColumnName = "id")
    @ToString.Exclude
    private Course course;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "abeekCode", referencedColumnName = "code")
    private Abeek abeek;

    @Column(nullable = false)
    private BigDecimal credit;
}
