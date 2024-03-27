package jbnu.it.cms.domain.dto.request;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
public class CourseRequestDto {
    private String id;
    private String name;
    private BigDecimal credit;
}
