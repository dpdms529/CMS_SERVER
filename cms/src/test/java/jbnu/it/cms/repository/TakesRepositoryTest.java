package jbnu.it.cms.repository;

import jbnu.it.cms.domain.entity.Takes;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class TakesRepositoryTest {

    @Autowired TakesRepository takesRepository;

    @Test
    public void findAll() {
        List<Takes> takesList = takesRepository.findAll();

        for(Takes take : takesList) {
            System.out.println("take = " + take);
        }
    }

}
