package university.person.service;

import java.util.List;

import university.person.Student;
import university.person.dao.StudentDao;

public class StudentService implements StudentDao{
	
	List<Student> students = StudentDao.students;
	
	@Override
	public List<Student> getAllStudents() {
		return students;
	}

	@Override
	public Student getStudent(long id) {
		Student result = null;
		for (Student s:students) {
			if (s.getId() == id) {
				result = s;
			}
		}
		return result;
	}
	
	
	public void addStudent(Student student) {
		students.add(student);
	}

	public void updateStudent(Student student) {
		students.get((int) student.getId()).setFirstName(student.getFirstName());
	}

	public void deleteStudent(Student student) {
		students.remove((int) student.getId());
	}
	

}
