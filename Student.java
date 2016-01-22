package university;

import static university.FormOfEducation.*;
import java.util.Date;

public class Student extends Person {

	private Date enrollmentDate;
	private Group group;
	private FormOfEducation formOfEducation;

	public Student(String n, String s, Date d, Sex se, Status st, Date enrollD) {
		super(n, s, d, se, st);
		setEnrollmentDate(enrollD);
		this.setFormOfEducation(INTRAMURAL);
	}

	public FormOfEducation getFormOfEducation() {
		return formOfEducation;
	}

	public void setFormOfEducation(FormOfEducation formOfEducation) {
		FormOfEducation[] foe = FormOfEducation.values();
		boolean flag = false;
		for (FormOfEducation f:foe) {
			if (f.equals(formOfEducation)) {
				flag = true;
			}
		}
		if (flag) {
			this.formOfEducation = formOfEducation;
		} else {
			throw new IllegalArgumentException("FormOfEducation must be {EXTRAMURAL, INTRAMURAL, ONLINE}");
		}
		this.formOfEducation = formOfEducation;
	}

	public Date getEnrollmentDate() {
		return enrollmentDate;
	}

	public void setEnrollmentDate(Date enrollmentDate) {
		if (enrollmentDate.toString().trim().length() == 0) {
			throw new IllegalArgumentException("Date of birth must be set");
		}
		this.enrollmentDate = enrollmentDate;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public Specialty getSpecialty() {
		return null;
	}

	@Override
	public Faculty getFaculty() {
		return group.getFaculty();
	}

	public Employee getCurator() {
		return group.getCurator();
	}

	@Override
	public String toString() {
		return "Student [getSex()=" + getSex() + ", getFirstName()=" + getFirstName() + ", getLastName()="
				+ getLastName() + ", getAge()=" + getAge() + "]";
	}

	@Override
	public void fire() {
		// TODO Auto-generated method stub

	}

}
