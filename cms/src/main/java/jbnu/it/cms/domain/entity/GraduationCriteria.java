package jbnu.it.cms.domain.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class GraduationCriteria {
    @Id
    private int admissionYear;

    @Id
    private String graduationCriteriaItemCode;

    @Column(nullable = false)
    private BigDecimal credit;

    @ManyToOne
    @JoinColumn(name = "graduationCriteriaItemCode", referencedColumnName = "code")
    private GraduationCriteriaItem graduationCriteriaItem;
}
