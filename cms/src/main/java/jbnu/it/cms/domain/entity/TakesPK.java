package jbnu.it.cms.domain.entity;

import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serializable;

@Data
public class TakesPK implements Serializable {
    private int year;
    private int semester;
    private int target_grade;
    private String course_id;
    private String student_id;
}
