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
    @Column(name = "`year`")
    private int year;

    @Id
    private int semester;

    @Id
    private int targetGrade;

    @Id
    private String courseId;

    @Id
    private String studentId;

    @Column(nullable = false)
    private String gp;
}
