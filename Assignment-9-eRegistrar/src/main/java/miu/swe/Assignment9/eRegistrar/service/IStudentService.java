package miu.swe.Assignment9.eRegistrar.service;

import miu.swe.Assignment9.eRegistrar.entity.Student;

import java.util.List;

public interface IStudentService{
    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudentById(Long id);

    Student updateStudent(Student student);

    void deleteStudentById(Long id);
}
