package jbnu.it.cms.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Student {
    @Id
    private String id;

    @Column(name = "`name`", nullable = false)
    private String name;

    private BigDecimal totalCredit;

    private BigDecimal gpa;

    @Column(nullable = false)
    private String password;

    @Builder.Default
    @OneToMany(mappedBy = "student")
    @ToString.Exclude
    List<Takes> takesList = new ArrayList<>();
}
