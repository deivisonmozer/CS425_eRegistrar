package miu.swe.Assignment9.eRegistrar;

import miu.swe.Assignment9.eRegistrar.entity.Course;
import miu.swe.Assignment9.eRegistrar.entity.Student;
import miu.swe.Assignment9.eRegistrar.repository.CourseRepository;
import miu.swe.Assignment9.eRegistrar.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Assignment9ERegistrarApplication implements CommandLineRunner {

	public static void main(String[] args) {

		SpringApplication.run(Assignment9ERegistrarApplication.class, args);
	}
	@Autowired
	private StudentRepository studentRepository;
	@Autowired
	private CourseRepository courseRepository;
	@Override
	public void run(String... args) throws Exception {


//		 Student student1 = new Student("Ramesh", "Fadatare", "ramesh@gmail.com");
//		 studentRepository.save(student1);
//
//		 Student student2 = new Student("Sanjay", "Jadhav", "sanjay@gmail.com");
//		 studentRepository.save(student2);
//
//		 Student student3 = new Student("tony", "stark", "tony@gmail.com");
//		 studentRepository.save(student3);
//		 Course c1 = new Course("ASD");
//		 courseRepository.save(c1);
	}

}
