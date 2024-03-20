package jbnu.it.cms.repository;

import jbnu.it.cms.domain.entity.Course;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Sql(scripts = {"classpath:scheme.sql"})
@Transactional
class CourseRepositoryTest {

    @Autowired CourseRepository courseRepository;

    @Test
    public void findAll() throws Exception {
        //given
        List<Course> courses = courseRepository.findAll();
        for (Course course : courses) {
            System.out.println(course);
        }

        //when

        //then
    }

}