package jbnu.it.cms.domain.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class PreCoursePK implements Serializable {
    Course course;
    Course preCourse;
}
