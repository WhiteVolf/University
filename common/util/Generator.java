package university.common.util;

import static university.person.Sex.*;

import java.time.LocalDate;
import java.util.Random;

import university.person.Sex;

public class Generator {
	private static String[] names = { "Oleg", "Marina", "Aleksandr", "Nastya", "Koliya", "Natasha", "Maksim", "Marina", "Toliya",
			"Svetlana", "Pavel", "Oksana", "Semen", "Ira", "Denis", "Katya", "Roman", "Inna", "Philip", "Zlata",
			"Sergey", "Sophia" };

	private static String[] surnames = { "Hlebnik", "Nordic", "Semenchenko", "Volia", "Karens", "Golovko", "Andropov", "Marinin",
			"Zagulko", "Lukianenko", "Shevchenko", "Ivanov", "Petrov", "Sidorov", "Kapusta" };

	private static Sex[] sexs = {MALE, FEMALE};
	
	public static String genName(){
		byte i = (byte) Math.round((Math.random() * (names.length - 1)));
		return names[i];
	}

	public static String genSurname(){
		byte i = (byte) Math.round((Math.random() * (surnames.length - 1)));
		return surnames[i];
	}
	
	public static LocalDate genBirthday(){
		LocalDate startDate = LocalDate.parse("1950-01-01");
		int d = (int) Math.round(Math.random()*17898);
		return startDate.plusDays(d);
	}
	
	public static Sex getSex(){
		Random rnd = new Random();
		return sexs[rnd.nextInt(2)];
	}


}
