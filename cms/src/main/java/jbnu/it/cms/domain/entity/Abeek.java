package jbnu.it.cms.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Abeek {
    @Id
    private String code;

    @Column(name = "`name`", nullable = false)
    private String name;

    @Builder.Default
    @OneToMany(mappedBy = "abeek")
    @ToString.Exclude
    private List<AbeekCourse> abeekCourses = new ArrayList<>();
}
