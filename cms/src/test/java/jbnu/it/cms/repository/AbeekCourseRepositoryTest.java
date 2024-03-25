package jbnu.it.cms.repository;

import jbnu.it.cms.domain.entity.AbeekCourse;
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
class AbeekCourseRepositoryTest {

    @Autowired AbeekCourseRepository abeekCourseRepository;
    @Test
    public void findAll() throws Exception {
        //given

        //when
        List<AbeekCourse> result = abeekCourseRepository.findAll();

        //then
        assertThat(result.size()).isEqualTo(69);
    }

}