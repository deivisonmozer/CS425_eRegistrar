package miu.swe.Assignment9.eRegistrar.repository;

import miu.swe.Assignment9.eRegistrar.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}