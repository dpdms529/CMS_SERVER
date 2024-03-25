package jbnu.it.cms.repository;

import jbnu.it.cms.domain.entity.AbeekCourse;
import jbnu.it.cms.domain.entity.AbeekCoursePK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AbeekCourseRepository extends JpaRepository<AbeekCourse, AbeekCoursePK> {
}
