package jbnu.it.cms.repository;

import jbnu.it.cms.domain.entity.Course;
import jbnu.it.cms.domain.entity.Section;
import jbnu.it.cms.domain.entity.SectionPK;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SectionRepository extends JpaRepository<Section, SectionPK> {
    List<Section> findByCourse(Course course);
}
