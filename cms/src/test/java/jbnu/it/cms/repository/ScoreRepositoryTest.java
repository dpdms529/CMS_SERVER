package jbnu.it.cms.repository;

import jbnu.it.cms.domain.entity.Score;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class ScoreRepositoryTest {

    @Autowired ScoreRepository scoreRepository;

    @Test
    public void findAll() {
        List<Score> scores = scoreRepository.findAll();

        for (Score score : scores) {
            System.out.println("score = " + score);
        }

        assertThat(scores.size()).isEqualTo(10);
    }

}
