package assign1.studentReg;

import java.util.ArrayList;

public class Student {
	
	private String name;
	private int age;
	private String DOB;
	private String username;
	
	private ArrayList<Module> modules = new ArrayList<Module>();
	private Course course;
	
	public Student (String name, int age, String DOB) {
		this.setName(name);
		this.setAge(age);
		this.setDOB(DOB);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}
	
	public String getUsername() {
		this.username = (String)(name + age);
		return username;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public ArrayList<Module> getModules() {
		return modules;
	}

	public void setModules(ArrayList<Module> modules) {
		this.modules = modules;
	}
	
	public void addModule(Module module) {
		modules.add(module);
	}
	
	// method to return printable details for the student
	public String getDetails() {
		
		// loops over the studetns modules and creates a string to represent them
		StringBuilder modulesString = new StringBuilder();
		for (int i = 0; i < this.getModules().size(); i++) {
			modulesString.append("\t" + this.getModules().get(i).getModuleName() + "\n");
		}
		
		//returns string with the required data
		return("Name: " + this.getName() + "\n" 
				+ "Course:" + this.getCourse().getCourseName() + "\n"
				+ "Modules: \n" + modulesString);	
	}
}
