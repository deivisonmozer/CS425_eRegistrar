package miu.swe.Assignment9.eRegistrar.service;

import miu.swe.Assignment9.eRegistrar.entity.Course;
import miu.swe.Assignment9.eRegistrar.repository.CourseRepository;

import java.util.List;

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
    public Course saveCourse(Course student) {
        return courseRepository.save(student);
    }

    @Override
    public Course getCourseById(Long id) {
        return courseRepository.findById(id).get();
    }

    @Override
    public Course updateCourse(Course student) {
        return courseRepository.save(student);
    }

    @Override
    public void deleteCourseById(Long id) {
        courseRepository.deleteById(id);
    }
}
