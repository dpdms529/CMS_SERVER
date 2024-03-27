package jbnu.it.cms.domain.dto.request;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CourseClassificationRequestDto {
    private String code;
    private String name;
}
