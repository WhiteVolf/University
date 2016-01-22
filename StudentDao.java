package university;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StudentDao {
	
	List students = new ArrayList();
	
	public Student getStudentById(long id) {
		return (Student) students.get((int) id);
	}
	
	public void createStudent(String n, String s, Date d, Sex se, Status st, Date enrollD){
		Student student = new Student(n, n, enrollD, se, st, enrollD);
		students.add(student);
	}
	
	public void removeStudent(long id) {
		students.remove(id);
	}
}
