package miu.swe.Assignment9.eRegistrar.repository;

import miu.swe.Assignment9.eRegistrar.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
