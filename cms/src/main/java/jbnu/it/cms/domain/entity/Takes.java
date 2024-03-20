package jbnu.it.cms.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Data
@Builder
@IdClass(TakesPK.class)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Takes {
    @Id
    private int takesYear;

    @Id
    private int takesSemester;

    @Id
    private int targetGrade;

    @Id
    private String courseId;

    @Id
    private String studentId;

    @Column(nullable = false)
    private String gp;
}
