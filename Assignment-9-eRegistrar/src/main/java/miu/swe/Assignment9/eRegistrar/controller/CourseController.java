package miu.swe.Assignment9.eRegistrar.controller;

import miu.swe.Assignment9.eRegistrar.entity.Course;
import miu.swe.Assignment9.eRegistrar.entity.Student;
import miu.swe.Assignment9.eRegistrar.service.CourseService;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;

public class CourseController {
    private CourseService courseService;

    public CourseController(CourseService courseService) {
        super();
        this.courseService = courseService;
    }

    @GetMapping("/courses")
    public String listCourses(Model model) {
        List<Course> courses = courseService.getAllCourses();
        model.addAttribute("courses", courses);
        return "courses";
    }

    @GetMapping("/courses/new")
    public String createCourseForm(Model model) {

        // create course object to hold course form data
//        Course course = new Course();
//        model.addAttribute("course", course);
        return "create_course";

    }

    @PostMapping("/courses")
    public String saveCourse(@ModelAttribute("course") Course course) {
        courseService.saveCourse(course);
        return "redirect:/courses";
    }

}
