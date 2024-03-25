package jbnu.it.cms.domain.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@ToString
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class GraduationCriteriaItem {
    @Id
    private String code;

    @Column(name = "`name`", nullable = false)
    private String name;

    @Builder.Default
    @OneToMany(mappedBy = "graduationCriteriaItem")
    private List<GraduationCriteria> graduationCriteria = new ArrayList<>();
}
