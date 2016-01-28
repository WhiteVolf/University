package university.unit;

import university.person.Employee;

public class Department extends StructuralUnit {

	private Specialty[] specialties;
	private Employee[] employees;
	private Employee head;
	private Faculty faculty;
	
	public Department(String s, Employee e, Faculty f) {
		super(s);
		this.head = e;
		this.faculty = f;
	}

	public Employee getHead() {
		return head;
	}

	public void setHead(Employee head) {
		this.head = head;
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

	public Specialty[] getSpecialties() {
		return specialties;
	}
	
	public void addSpecialty(Specialty s) {
		
	}
	
	public void removeSpecialty(Specialty s) {
		
	}

	public Employee[] getEmployees() {
		return employees;
	}
	
	public void addEmployee(Employee e) {
		
	}
	
	public void removeEmployee(Employee e) {
		
	}
	
	public int getStudentsNumber(){
		return 0;
	}
	
	public byte getSize(){
		return 0;
	}

}
