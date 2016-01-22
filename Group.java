package university;

import java.util.Date;

public class Group extends StructuralUnit {

	private Date dateOfCreation;
	private Student[] students = {};
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

	public Student[] getStudents() {
		return students;
	}
	
	public void addStudent(Student s) {
		int len = this.students.length+1;
		Student[] b = new Student[len];
		System.arraycopy(this.students, 0, b, 0, this.students.length);
		b[len-1] = s;
		this.students = b;
	}
	
	public void removeStudent(Student s) {
		
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
