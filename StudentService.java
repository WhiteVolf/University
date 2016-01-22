package university;

import java.util.Date;

public class StudentService {
	private StudentDao studentDao;
	
	public StudentDao getStudentDao() {return studentDao;}
	
	public void setStudentDao(StudentDao sd) {
		this.studentDao = sd;
	}
	
	public void createStudent(String n, String s, Date d, Sex se, Status st, Date enrollD){
		studentDao.createStudent(n, s, d, se, st, enrollD);
	}
}
