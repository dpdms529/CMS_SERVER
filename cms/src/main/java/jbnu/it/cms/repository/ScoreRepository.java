package jbnu.it.cms.repository;

import jbnu.it.cms.domain.entity.Score;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ScoreRepository extends JpaRepository<Score, String> {
}
