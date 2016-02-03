package university.unit;

import java.util.List;
import java.util.Set;

import university.person.Employee;

public class Department extends StructuralUnit {

	private Set<Specialty> specialties;
	private List<Employee> employees;
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

	public Set<Specialty> getSpecialties() {
		return specialties;
	}
	
	public void addSpecialty(Specialty s) {
		this.specialties.add(s);
	}
	
	public void removeSpecialty(Specialty s) {
		this.specialties.remove(s);
	}

	public List<Employee> getEmployees() {
		return employees;
	}
	
	public void addEmployee(Employee e) {
		this.employees.add(e);
	}
	
	public void removeEmployee(Employee e) {
		this.employees.remove(e);
	}
	
	public int getStudentsNumber(){
		return 0;
	}
	
	public byte getSize(){
		return 0;
	}

}
