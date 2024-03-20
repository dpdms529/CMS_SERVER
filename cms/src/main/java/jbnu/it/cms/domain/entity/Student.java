package jbnu.it.cms.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Student {
    @Id
    private String id;

    @Column(nullable = false)
    private String name;

    private BigDecimal totalCredit;

    private BigDecimal gpa;

    @Column(nullable = false)
    private String password;
}
