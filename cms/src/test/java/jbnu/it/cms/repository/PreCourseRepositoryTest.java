package jbnu.it.cms.repository;

import jbnu.it.cms.domain.entity.PreCourse;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class PreCourseRepositoryTest {
    @Autowired PreCourseRepository preCourseRepository;

    @Test
    public void findAll() throws Exception {
        //given

        //when
        List<PreCourse> result = preCourseRepository.findAll();

        //then
        assertThat(result.size()).isEqualTo(30);
    }

}