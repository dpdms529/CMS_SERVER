package jbnu.it.cms.repository;

import jbnu.it.cms.domain.entity.Section;
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
class SectionRepositoryTest {
    @Autowired SectionRepository sectionRepository;
    @Autowired CourseRepository courseRepository;

    @Test
    public void findByCourseId() throws Exception {
        //given
        List<Section> byCourseId = sectionRepository.findByCourse(courseRepository.findById("0000103282").get());

        //when

        //then
        for (Section section : byCourseId) {
            System.out.println(section);
        }
        
    }
}