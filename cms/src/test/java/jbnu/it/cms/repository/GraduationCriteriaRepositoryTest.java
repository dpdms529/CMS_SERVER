package jbnu.it.cms.repository;

import jbnu.it.cms.domain.entity.GraduationCriteria;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@SpringBootTest
@Transactional
public class GraduationCriteriaRepositoryTest {

    @Autowired GraduationCriteriaRepository graduationCriteriaRepository;

    @Test
    public void findAll() {
        List<GraduationCriteria> graduationCriteriaList = graduationCriteriaRepository.findByAdmissionYear(2019);

        for(GraduationCriteria graduationCriteria : graduationCriteriaList) {
            System.out.println("graduationCriteria = " + graduationCriteria);
        }

    }
}
