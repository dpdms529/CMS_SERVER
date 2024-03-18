package jbnu.it.cms.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Data
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Student {
    @Id
    @Column(name = "student_id")
    private String id;

    @Column(nullable = false)
    private String name;

    private BigDecimal total_credit;

    private BigDecimal gpa;

    @Column(nullable = false)
    private String password;
}
