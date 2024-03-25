package jbnu.it.cms.repository;

import jbnu.it.cms.domain.entity.CourseClassification;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class CourseClassificationRepositoryTest {

    @Autowired CourseClassificationRepository courseClassificationRepository;

    @Test
    public void findAll() {
        List<CourseClassification> courseClassifications = courseClassificationRepository.findAll();

        for (CourseClassification courseClassification : courseClassifications) {
            System.out.println(courseClassification);
        }
    }
}
