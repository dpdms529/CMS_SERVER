package jbnu.it.cms.repository;

import jbnu.it.cms.domain.entity.GraduationCriteria;
import jbnu.it.cms.domain.entity.GraduationCriteriaPK;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GraduationCriteriaRepository extends JpaRepository<GraduationCriteria, GraduationCriteriaPK> {
    List<GraduationCriteria> findByAdmissionYear(int year);
}
