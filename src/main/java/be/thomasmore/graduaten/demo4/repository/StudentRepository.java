package be.thomasmore.graduaten.demo4.repository;

import be.thomasmore.graduaten.demo4.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Long> {
    List<Student> findByKlas(String klas);

}
