package be.thomasmore.graduaten.demo4.service;

import be.thomasmore.graduaten.demo4.entity.Student;
import be.thomasmore.graduaten.demo4.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;

    public List<Student> retrieveStudents() {
        return studentRepository.findAll();
    }
}
