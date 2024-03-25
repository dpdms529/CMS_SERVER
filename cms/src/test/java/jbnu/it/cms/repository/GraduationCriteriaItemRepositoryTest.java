package jbnu.it.cms.repository;

import jbnu.it.cms.domain.entity.GraduationCriteriaItem;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class GraduationCriteriaItemRepositoryTest {

    @Autowired GraduationCriteriaItemRepository graduationCriteriaItemRepository;

    @Test
    public void findAll() {

        List<GraduationCriteriaItem> graduationCriteriaItems = graduationCriteriaItemRepository.findAll();

        for (GraduationCriteriaItem graduationCriteriaItem : graduationCriteriaItems) {
            System.out.println("graduationCriteriaItem = " + graduationCriteriaItem);
        }
    }
}
