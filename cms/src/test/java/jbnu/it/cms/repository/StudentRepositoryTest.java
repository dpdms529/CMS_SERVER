package jbnu.it.cms.repository;

import jbnu.it.cms.domain.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class StudentRepositoryTest {
    @Autowired StudentRepository studentRepository;

    @Test
    public void findAll() {
        List<Student> students = studentRepository.findAll();

        for (Student student : students) {
            System.out.println(student);
        }
    }

}
