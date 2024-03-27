package jbnu.it.cms.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jbnu.it.cms.domain.dto.request.CourseRequestDto;
import lombok.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Course {
    @Id
    private String id;
    @Column(name = "`name`", nullable = false)
    private String name;
    @Column(nullable = false)
    private BigDecimal credit;

    @Builder.Default
    @OneToMany(mappedBy = "course")
    private List<Section> sections = new ArrayList<>();

    @Builder.Default
    @OneToMany(mappedBy = "course")
    private List<PreCourse> preCourses = new ArrayList<>();

    @Builder.Default
    @OneToMany(mappedBy = "course")
    private List<AbeekCourse> abeekCourses = new ArrayList<>();

    public static Course toEntity(CourseRequestDto courseRequestDto) {
        return Course.builder()
                .id(courseRequestDto.getId())
                .name(courseRequestDto.getName())
                .credit(courseRequestDto.getCredit())
                .build();
    }
}
