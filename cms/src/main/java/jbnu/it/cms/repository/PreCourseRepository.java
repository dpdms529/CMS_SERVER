package jbnu.it.cms.repository;

import jbnu.it.cms.domain.entity.PreCourse;
import jbnu.it.cms.domain.entity.PreCoursePK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PreCourseRepository extends JpaRepository<PreCourse, PreCoursePK> {
}
