package jbnu.it.cms.domain.dto.request;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@Builder
public class StudentRequestDto {
    private String id;
    private String name;
    private BigDecimal totalCredit;
    private BigDecimal gpa;
    private String password;

}
