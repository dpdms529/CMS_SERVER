package jbnu.it.cms.repository;

import jbnu.it.cms.domain.entity.Section;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

@SpringBootTest
@Transactional
class SectionRepositoryTest {
    @Autowired SectionRepository sectionRepository;

    @Test
    public void findAll() throws Exception {
        //given

        //when
        List<Section> result = sectionRepository.findAll();

        //then
        assertThat(result.size()).isEqualTo(282);
    }
}