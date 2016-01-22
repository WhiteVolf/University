package university;

import static university.FormOfWork.*;
import java.util.Date;

public class Employee extends Person {

	private Date hireDate;
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

	Employee(String n, String s, Date d, Sex se, Status st, Date d2) {
		super(n, s, d, se, st);
		setHireDate(d2);
		this.setFormOfWork(PERMANENT);
	}

	@Override
	public Faculty getFaculty() {
		// TODO Auto-generated method stub
		return department.getFaculty();
	}

	public Date getHireDate() {
		return hireDate;
	}

	public void setHireDate(Date hireDate) {
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
