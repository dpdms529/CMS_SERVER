package jbnu.it.cms.domain.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class AbeekCoursePK implements Serializable {
    Course course;
    Abeek abeek;
}
