package miu.swe.Assignment9.eRegistrar.controller;

import miu.swe.Assignment9.eRegistrar.entity.Student;
import miu.swe.Assignment9.eRegistrar.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Controller
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        super();
        this.studentService = studentService;
    }

    // handler method to handle list students and return mode and view
    @GetMapping("/students")
    public String listStudents(Model model) {
        model.addAttribute("students", studentService.getAllStudents());
        return "students";
    }
    // handler method to handle list students and return mode and view
    @GetMapping("/students/search")
    public String searchStudents(@RequestParam(name = "studentName", required = false) String studentName, Model model) {
        List<Student> foundStudent = studentService.getAllStudents().stream().filter(x->x.getFirstName().equals(studentName)).collect(Collectors.toList());;

        if (studentName != null) {
            //List<Student> result = studentService.getAllStudents().stream().filter(x->x.getFirstName().equals(studentName)).collect(Collectors.toList());
//            if(result.size() > 0)
//                foundStudent = result.get(0);
                model.addAttribute("foundStudent", foundStudent);
        }
        return "search_student";
    }

    @GetMapping("/students/new")
    public String createStudentForm(Model model) {

        // create student object to hold student form data
        Student student = new Student();
        model.addAttribute("student", student);
        List<String> isInternationalOptions = Arrays.asList("Yes","No");
        model.addAttribute("isInternationalOptions", isInternationalOptions);
        return "create_student";

    }

    @PostMapping("/students")
    public String saveStudent(@ModelAttribute("student") Student student) {
        studentService.saveStudent(student);
        return "redirect:/students";
    }

    @GetMapping("/students/edit/{id}")
    public String editStudentForm(@PathVariable Long id, Model model) {
        model.addAttribute("student", studentService.getStudentById(id));
        return "edit_student";
    }

    @PostMapping("/students/{id}")
    public String updateStudent(@PathVariable Long id,
                                @ModelAttribute("student") Student student,
                                Model model) {

        // get student from database by id
        Student existingStudent = studentService.getStudentById(id);
        existingStudent.setId(id);
        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setMiddleName(student.getMiddleName());
        existingStudent.setLastName(student.getLastName());
        existingStudent.setEmail(student.getEmail());
        existingStudent.setStudentNumber(student.getStudentNumber());
        existingStudent.setEnrollmentDate(student.getEnrollmentDate());
        existingStudent.setIsInternational(student.getIsInternational());

        // save updated student object
        studentService.updateStudent(existingStudent);
        return "redirect:/students";
    }

    // handler method to handle delete student request

    @GetMapping("/students/{id}")
    public String deleteStudent(@PathVariable Long id) {
        studentService.deleteStudentById(id);
        return "redirect:/students";
    }

}