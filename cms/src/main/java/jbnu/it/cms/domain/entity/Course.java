package jbnu.it.cms.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
}
