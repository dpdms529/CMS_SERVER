package jbnu.it.cms.domain.entity;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@ToString(exclude = "graduationCriteriaItem")
@IdClass(GraduationCriteriaPK.class)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class GraduationCriteria {
    @Id
    private int admissionYear;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "graduationCriteriaItemCode", referencedColumnName = "code")
    private GraduationCriteriaItem graduationCriteriaItem;

    @Column(nullable = false)
    private BigDecimal credit;
}
