package jbnu.it.cms.repository;

import jbnu.it.cms.domain.entity.Course;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
@Transactional
class CourseRepositoryTest {

    @Autowired CourseRepository courseRepository;

    @Test
    public void findAll() throws Exception {
        //given

        //when
        List<Course> result = courseRepository.findAll();

        //then
        assertThat(result.size()).isEqualTo(64);

        for (Course course : result) {
            System.out.println("course = " + course);
        }
    }

}