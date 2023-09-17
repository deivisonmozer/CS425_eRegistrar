package miu.swe.Assignment9.eRegistrar.service;

import miu.swe.Assignment9.eRegistrar.entity.Course;

import java.util.List;

public interface ICourseService {
    List<Course> getAllCourses();

    Course saveCourse(Course student);

    Course getCourseById(Long id);

    Course updateCourse(Course student);

    void deleteCourseById(Long id);
}
