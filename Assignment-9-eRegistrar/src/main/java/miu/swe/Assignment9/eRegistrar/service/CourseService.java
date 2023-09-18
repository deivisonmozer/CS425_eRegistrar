package miu.swe.Assignment9.eRegistrar.service;

import miu.swe.Assignment9.eRegistrar.entity.Course;
import miu.swe.Assignment9.eRegistrar.repository.CourseRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService implements ICourseService{
    private CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public List<Course> getAllCourses() {
        return courseRepository.findAll();
    }

    @Override
    public Course saveCourse(Course course) {
        return courseRepository.save(course);
    }

//    @Override
//    public Course getCourseById(Long id) {
//        return courseRepository.findById(id).get();
//    }
//
//    @Override
//    public Course updateCourse(Course course) {
//        return courseRepository.save(course);
//    }
//
    @Override
    public void deleteCourseById(Long id) {
        courseRepository.deleteById(id);
    }
}
