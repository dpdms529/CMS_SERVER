package jbnu.it.cms.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public enum Score {
    APlus("A+", BigDecimal.valueOf(4.5)),
    A("A", BigDecimal.valueOf(4.0)),
    BPlus("B+", BigDecimal.valueOf(3.5)),
    B("B", BigDecimal.valueOf(3.0)),
    CPlus("C+", BigDecimal.valueOf(2.5)),
    C("C", BigDecimal.valueOf(2.0)),
    DPlus("D+", BigDecimal.valueOf(1.5)),
    D("D", BigDecimal.valueOf(1.0)),
    Pass("P", BigDecimal.valueOf(0.0)),
    Fail("F", BigDecimal.valueOf(0.0));

    @Id
    private String gp;

    @Column(nullable = false)
    private BigDecimal score;

    Score(String gp, BigDecimal score) {
        this.gp = gp;
        this.score = score;
    }
}
