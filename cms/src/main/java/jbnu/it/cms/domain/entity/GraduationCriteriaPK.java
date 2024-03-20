package jbnu.it.cms.domain.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class GraduationCriteriaPK implements Serializable {
    private int admissionYear;
    private String graduationCriteriaItemCode;
}
