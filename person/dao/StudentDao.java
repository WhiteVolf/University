package university.person.dao;

import java.util.ArrayList;
import java.util.List;

import university.person.Student;

public interface StudentDao {
	
	List<Student> students = new ArrayList<Student>();

	public List<Student> getAllStudents();
	
	public Student getStudent(long id);
	
	public void addStudent(Student student);
	
	public void updateStudent(Student student);
	
	public void deleteStudent(Student student);

}
