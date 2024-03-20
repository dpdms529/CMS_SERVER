package jbnu.it.cms.domain.entity;

import lombok.*;

import java.io.Serializable;

@Data
public class SectionPK implements Serializable {
    private int year;
    private int semester;
    private int targetGrade;
    private Course course;
}
