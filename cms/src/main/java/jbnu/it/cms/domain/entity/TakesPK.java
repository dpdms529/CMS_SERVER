package jbnu.it.cms.domain.entity;

import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serializable;

@Data
public class TakesPK implements Serializable {
    private Section section;
    private Student student;
}
