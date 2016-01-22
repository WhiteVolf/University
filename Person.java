package university;

import static ua.javadvanced.business.Sex.*;
import java.time.LocalDate;
import java.util.Date;

public abstract class Person extends Persistable implements Fireable{

	private String firstName;
	private String lastName;
	private Date birthDay;
	private Sex sex;
	private Status status;
	
	Person (String name, String lastName, Date date, Sex sex, Status status) {
		this.setFirstName(name);
		this.setLastName(lastName);
		this.setBirthDay(date);
		this.setSex(sex);
		this.setStatus(status);
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		Status[] ss = Status.values();
		boolean flag = false;
		for (Status s:ss) {
			if (s.equals(status)) {
				flag = true;
			}
		}
		if (flag) {
			this.status = status;
		} else {
			throw new IllegalArgumentException("Status must be {NEW, ACTIVE, FIRED, PENDING}");
		}
	}

	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		Sex[] ss = Sex.values();
		boolean flag = false;
		for (Sex s:ss) {
			if (s.equals(sex)) {
				flag = true;
			}
		}
		if (flag) {
			this.sex = sex;
		} else {
			throw new IllegalArgumentException("Sex must be MALE or FEMALE");
		}
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		if (firstName.trim().length()==0) {
			throw new IllegalArgumentException("Name must be set");
		}
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		if (lastName.trim().length()==0) {
			throw new IllegalArgumentException("Surname must be set");
		}
		this.lastName = lastName;
	}

	public Date getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(Date birthDay) {
		if (birthDay.toString().trim().length()==0) {
			throw new IllegalArgumentException("Date of birth must be set");
		}
		this.birthDay = birthDay;
	}
	
	public short getAge(){
		Date d = new Date();
		int today = d.getYear();
		return (short)(today - this.getBirthDay().getYear());
	}
	
	abstract public Faculty getFaculty();
}
