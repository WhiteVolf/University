package university.unit;

import java.util.Date;

import university.person.Employee;

public class Faculty extends StructuralUnit{

	private Date dateOfCreation;
	private Department[] departmnets;
	private Employee dean;
	
	public Faculty(String s, Date d, Employee e) {
		super(s);
		this.dateOfCreation = d;
		this.dean = e;
	}
	
	public Faculty(String s, Employee e) {
		super(s);
		this.dean = e;
	}

	public Date getDateOfCreation() {
		return dateOfCreation;
	}

	public void setDateOfCreation(Date dateOfCreation) {
		this.dateOfCreation = dateOfCreation;
	}

	public Employee getDean() {
		return dean;
	}

	public void setDean(Employee dean) {
		this.dean = dean;
	}

	public Department[] getDepartmnets() {
		return departmnets;
	}
	
	public void addDepartmnet(Department d) {
		
	}
	
	public void removeDepartmnet(Department d) {
		
	}
	
	public int getStudentsNumber(){
		return 0;
	}
	
	public int getEmployeesNumber(){
		return 0;
	}
	
	

}
