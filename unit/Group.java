package university.unit;

import java.util.Date;
import java.util.List;

import university.person.Employee;
import university.person.Student;

public class Group extends StructuralUnit {

	private Date dateOfCreation;
	private List<Student> students;
	private Specialty specialty;
	private Employee curator;

	public Group(String s, Date d, Specialty sp, Employee e) {
		super(s);
		this.dateOfCreation = d;
		this.specialty = sp;
		this.curator = e;
	}

	public Group(String s, Specialty sp, Employee e) {
		super(s);
		this.specialty = sp;
		this.curator = e;
	}

	public Date getDateOfCreation() {
		return dateOfCreation;
	}

	public void setDateOfCreation(Date dateOfCreation) {
		this.dateOfCreation = dateOfCreation;
	}

	public Specialty getSpecialty() {
		return specialty;
	}

	public void setSpecialty(Specialty specialty) {
		this.specialty = specialty;
	}

	public Employee getCurator() {
		return curator;
	}

	public void setCurator(Employee curator) {
		this.curator = curator;
	}

	public List<Student> getStudents() {
		return students;
	}
	
	public void addStudent(Student s) {
		this.students.add(s);
	}
	
	public void removeStudent(Student s) {
		this.students.remove(s);
	}

	public short getYear(){
		return 0;
	}
	
	public byte getSize(){
		return 0;
	}
	
	public Department getDepartment(){
		return null;
	}
	
	public Faculty getFaculty(){
		return null;
	}
	
}
