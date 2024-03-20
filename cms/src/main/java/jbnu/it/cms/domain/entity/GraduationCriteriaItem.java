package jbnu.it.cms.domain.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class GraduationCriteriaItem {
    @Id
    private String code;

    @Column(nullable = false)
    private String name;

    @OneToMany(mappedBy = "GraduationCriteria")
    private List<GraduationCriteria> graduationCriteria = new ArrayList<>();
}
