package jbnu.it.cms.domain.dto.request;

import lombok.*;

@Getter
@Setter
@Builder
public class SectionRequestDto {
    private int year;
    private int semester;
    private int targetGrade;
    private CourseRequestDto course;
    private CourseClassificationRequestDto courseClassification;

}
