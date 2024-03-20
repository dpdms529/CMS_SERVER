package jbnu.it.cms.domain.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class SectionPK implements Serializable {
    private int year;
    private int semester;
    private int targetGrade;
    private String courseId;
}
