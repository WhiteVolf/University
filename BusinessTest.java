package university;

import static university.Sex.*;
import static university.Status.*;
import java.sql.Date;
import ua.javadvanced.business.*;

public class BusinessTest {

	public static void main(String[] args) {
		String[] names = { "Oleg", "Marina", "Aleksandr", "Nastya", "Koliya", "Natasha", "Maksim", "Marina", "Toliya",
				"Svetlana", "Pavel", "Oksana", "Semen", "Ira", "Denis", "Katya", "Roman", "Inna", "Philip", "Zlata",
				"Sergey", "Sophia" };

		String[] surnames = { "Hlebnik", "Nordic", "Semenchenko", "Volia", "Karens", "Golovko", "Andropov", "Marinin",
				"Zagulko", "Lukianenko", "Shevchenko", "Ivanov", "Petrov", "Sidorov", "Kapusta" };

		Sex[] sexs = {MALE, FEMALE};
		
		byte NUMBER_OF_STUDENTS = 64;
		byte NUMBER_OF_EMPLOYEES = 24;

		Student[] students = new Student[NUMBER_OF_STUDENTS];
		Employee[] employees = new Employee[NUMBER_OF_EMPLOYEES];

		
		for (int i = 0; i < NUMBER_OF_STUDENTS; i++) {
			byte iName = (byte) Math.round((Math.random() * (names.length - 1)));
			byte iSurname = (byte) Math.round((Math.random() * (surnames.length - 1)));
			byte iSex = (byte) Math.round((Math.random() * (sexs.length - 1)));
			students[i] = new Student(names[iName], surnames[iSurname], Date.valueOf("1994-03-03"),
					sexs[iSex],NEW,Date.valueOf("2000-02-22"));
			
		}

		for (int i = 0; i < NUMBER_OF_EMPLOYEES; i++) {
			byte iName = (byte) Math.round((Math.random() * (names.length - 1)));
			byte iSurname = (byte) Math.round((Math.random() * (surnames.length - 1)));
			byte iSex = (byte) Math.round((Math.random() * (sexs.length - 1)));
			employees[i] = new Employee(names[iName], surnames[iSurname], Date.valueOf("1994-03-03"),
					sexs[iSex],NEW,Date.valueOf("2000-02-22"));
		}

		for (int i = 0; i < NUMBER_OF_STUDENTS; i++) {
			System.out.println(i + " " + students[i].toString());
		}

		for (int i = 0; i < NUMBER_OF_EMPLOYEES; i++) {
			System.out.println(i + " " + employees[i].toString());
		}
		Faculty f1 = new Faculty("ACS-F2", employees[0]);
		Department d = new Department("ACS", employees[2], f1);
		Specialty sp1 = new Specialty("Finance", d);
		Group g1 = new Group("G1", Date.valueOf("2013-05-01"), sp1, employees[3]);

		g1.addStudent(students[0]);
		g1.addStudent(students[1]);
		g1.addStudent(students[2]);

		Student[] ss = g1.getStudents();

		System.out.println("Students: ");

		for (Student s : ss) {
			System.out.println(s.toString());
		}

		g1.removeStudent(students[1]);

		for (Student s : ss) {
			System.out.println(s.toString());
		}

	}

}
