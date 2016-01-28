package university.unit;

import java.util.List;

import university.person.Degree;

public class Specialty extends StructuralUnit {
	
	private Group[] groups;
	private Department department;
	@SuppressWarnings("unused")
	private List<Degree> degreeVariants;
	
	public Specialty(String s, Department d) {
		super(s);
		this.department = d;
	}

	public Department getDepartmnet() {
		return department;
	}

	public void setDepartmnet(Department department) {
		this.department = department;
	}

	public Group[] getGroups() {
		return groups;
	}

	public void addGroup(Group g) {
		
	}
	
	public void removeGroup(Group g) {
		
	}
	
	public int getStudentsNumber(){
		return 0;
	}
	
	public Faculty getFaculty(){
		return null;
	}

	
}
