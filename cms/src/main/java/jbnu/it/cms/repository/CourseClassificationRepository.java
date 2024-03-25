package jbnu.it.cms.repository;

import jbnu.it.cms.domain.entity.CourseClassification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseClassificationRepository extends JpaRepository<CourseClassification, String> {
}
