package jbnu.it.cms.service;

import jbnu.it.cms.domain.dto.request.TakesRequestDto;
import jbnu.it.cms.domain.entity.SectionPK;
import jbnu.it.cms.domain.entity.Takes;
import jbnu.it.cms.repository.ScoreRepository;
import jbnu.it.cms.repository.SectionRepository;
import jbnu.it.cms.repository.StudentRepository;
import jbnu.it.cms.repository.TakesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
@RequiredArgsConstructor
public class TakesService {
    private final TakesRepository takesRepository;
    private final SectionRepository sectionRepository;
    private final StudentRepository studentRepository;
    private final ScoreRepository scoreRepository;

    /**
     * 이수 과목 추가
     */
    public void addTakes(TakesRequestDto takesRequestDto) {
        Takes takes = Takes.toEntity(takesRequestDto);
        takesRepository.save(takes);
    }
}
