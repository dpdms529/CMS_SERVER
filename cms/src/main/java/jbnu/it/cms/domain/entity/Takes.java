package jbnu.it.cms.domain.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@IdClass(TakesPK.class)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Takes {
    @Id
    @Column(name = "`year`")
    private int year;

    @Id
    private int semester;

    @Id
    private int targetGrade;

    @Id
    private String courseId;

    @Id
    private String studentId;

    @Column(nullable = false)
    private String gp;
}
