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
@Builder
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Score {
    @Id
    private String gp;

    @Column(nullable = false)
    private BigDecimal score;

    @Builder.Default
    @OneToMany(mappedBy = "score")
    @ToString.Exclude
    List<Takes> takesList = new ArrayList<>();
}
