package university.person;

import static university.person.FormOfWork.*;

import java.time.LocalDate;
import university.unit.Department;
import university.unit.Faculty;

public class Employee extends Person {

	private LocalDate hireDate;
	private Department department;
	private FormOfWork formOfWork;

	public FormOfWork getFormOfWork() {
		return formOfWork;
	}

	public void setFormOfWork(FormOfWork formOfWork) {
		FormOfWork[] fow = FormOfWork.values();
		boolean flag = false;
		for (FormOfWork f:fow) {
			if (f.equals(formOfWork)) {
				flag = true;
			}
		}
		if (flag) {
			this.formOfWork = formOfWork;
		} else {
			throw new IllegalArgumentException("FormOfWork must be {PERMANENT, CONTRACT}");
		}
	}

	Employee(String name, String lastName, LocalDate date, Sex sex, Status status, LocalDate date2) {
		super(name, lastName, date, sex, status);
		setHireDate(date2);
		this.setFormOfWork(PERMANENT);
	}

	@Override
	public Faculty getFaculty() {
		// TODO Auto-generated method stub
		return department.getFaculty();
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		if (hireDate.toString().trim().length() == 0) {
			throw new IllegalArgumentException("Hire date must be set");
		}
		this.hireDate = hireDate;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public short getExperience() {
		return 0;
	}

	public Employee getBoss() {
		return null;
	}

	@Override
	public String toString() {
		return "Employee [getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName() + ", getAge()="
				+ getAge() + "]";
	}

	@Override
	public void fire() {
		// TODO Auto-generated method stub

	}

}
