package university.test;

import university.person.Sex;
import university.person.Student;
import university.common.util.Generator;
import static university.person.Status.*;
import static university.person.Sex.*;

import java.beans.FeatureDescriptor;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class TestSaveToFile {

	public static void main(String[] args) throws IOException{
		
		List<Student> students = new ArrayList<Student>();
		
//		 for (int i=0;i<10;i++) {
//		 Student s = new Student(Generator.genName(), Generator.genSurname(),
//		 Generator.genBirthday(), Generator.getSex(), NEW);
//		 students.add(s);
//		 }
//		
//		 for (Student s : students) {
//		 System.out.println(s.toString());
//		 }
//		
//		 Path path = Paths.get("src/university/dao");
//		
//		 File f = new File(path + "/Students2.dao");
//		 System.out.println(f.getAbsoluteFile());
//		 if (!f.exists()) {
//		 f.createNewFile();
//		 }
//		
//		 FileWriter fw = new FileWriter(f.getAbsoluteFile());
//		
//		 for (Student s : students) {
//		 fw.write(studentToDaoFormat(s)+'\n');
//		 }
//		
//		 fw.close();

		 Path path = Paths.get("src/university/dao");
		
		 File f = new File(path + "/Students2.dao");
		
		 FileReader fr = new FileReader(f);
		
		 try (BufferedReader br = new BufferedReader(fr)) {
		 String line;
		 while ((line = br.readLine())!= null) {
		 System.out.println(line);
		 String[] arr = line.split(",");
		 Student s = new Student(arr[0].trim(),arr[1].trim(),
		 LocalDate.parse(arr[3].trim()),Sex.valueOf(arr[2].trim()),NEW);
		 
		 students.add(s);
		 }
		 }
		
		 for (Student s: students) {
		 System.out.println(s);
		 }		
			
	}
	
	static String studentToDaoFormat(Student student) {
		String std = student.toDAO();
		return std.substring(std.indexOf("[")+1, std.indexOf("]"));
	}
}
