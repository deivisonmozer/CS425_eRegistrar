package miu.swe.Assignment9.eRegistrar.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column(name = "course_name", nullable = false)
    public String courseName;

    @Column(name = "course_code", nullable = true)
    public String courseCode;

    @Column(name = "course_block", nullable = true)
    public String courseBlock;

    @Column(name = "number_students", nullable = true)
    public int numberOfStudents;

    public Course() {
    }

    public Course(String courseName, String courseCode, String courseBlock, int numberOfStudents) {
        super();
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.courseBlock = courseBlock;
        this.numberOfStudents = numberOfStudents;
    }


    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseBlock() {
        return courseBlock;
    }

    public void setCourseBlock(String courseBlock) {
        this.courseBlock = courseBlock;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }
}
