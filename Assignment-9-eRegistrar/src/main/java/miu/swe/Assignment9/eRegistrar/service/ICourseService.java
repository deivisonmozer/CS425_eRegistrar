package miu.swe.Assignment9.eRegistrar.service;

import miu.swe.Assignment9.eRegistrar.entity.Course;

import java.util.List;

public interface ICourseService {
    List<Course> getAllCourses();

    Course saveCourse(Course course);

//    Course getCourseById(Long id);
//
//    Course updateCourse(Course course);
//
    void deleteCourseById(Long id);
}
