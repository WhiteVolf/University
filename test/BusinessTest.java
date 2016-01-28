package university.test;

import static university.person.Status.*;

import university.common.util.Generator;
import university.person.Student;
import university.person.service.StudentService;

public class BusinessTest {

	public static void main(String[] args) {
				
		StudentService studentService = new StudentService();
		
		
		for (int i=0;i<34;i++) {
			Student s = new Student(Generator.genName(), Generator.genSurname(), Generator.genBirthday(), Generator.getSex(), NEW);
			studentService.addStudent(s);
		}
		
		for (Student s:studentService.getAllStudents()) {
			System.out.println(s.toString());
			System.out.println(s.getId());
		}
		
		
		

	}

}
