package jbnu.it.cms.domain.dto.request;

import lombok.*;

@Getter
@Setter
@Builder
public class TakesRequestDto {
    private SectionRequestDto section;
    private StudentRequestDto student;
    private ScoreRequestDto score;
}
