package jbnu.it.cms.repository;

import jbnu.it.cms.domain.entity.Takes;
import jbnu.it.cms.domain.entity.TakesPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TakesRepository extends JpaRepository<Takes, TakesPK> {
}
