package jbnu.it.cms.domain.dto.request;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
public class ScoreRequestDto {
    private String gp;
    private BigDecimal score;
}
