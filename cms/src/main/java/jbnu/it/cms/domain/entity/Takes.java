package jbnu.it.cms.domain.entity;

import jakarta.persistence.*;
import jbnu.it.cms.domain.dto.request.TakesRequestDto;
import lombok.*;

@Entity
@Getter
@ToString
@IdClass(TakesPK.class)
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Takes {
    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns(
            {
                    @JoinColumn(name = "`year`", referencedColumnName = "`year`"),
                    @JoinColumn(name = "semester", referencedColumnName = "semester"),
                    @JoinColumn(name = "targetGrade", referencedColumnName = "targetGrade"),
                    @JoinColumn(name = "courseId", referencedColumnName = "courseId")
            }
    )
    private Section section;

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "studentId", referencedColumnName = "id")
    private Student student;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "gp", nullable = false)
    private Score score;

    // TODO: 2024-03-27 student, score toEntity 메서드 생성 
    public static Takes toEntity(TakesRequestDto takesRequestDto) {
        return  Takes.builder()
                .section(Section.toEntity(takesRequestDto.getSection()))
                .student(new Student())
                .score(new Score())
                .build();
    }
}
