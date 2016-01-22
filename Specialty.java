package university;

public class Specialty extends StructuralUnit {
	
	private Group[] groups;
	private Department department;
	private Degree[] degreeVariants = Degree.values();
	
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
