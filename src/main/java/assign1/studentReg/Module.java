package assign1.studentReg;

import java.util.ArrayList;

public class Module {
	
	private String moduleName;
	private String ID;
	
	private ArrayList<Student> students = new ArrayList<Student>();
	private ArrayList<Course> courses = new ArrayList<Course>();
	
	
	public Module (String module, String ID, ArrayList<Student> studentlist) {
		
		this.setModuleName(module);
		this.setID(ID);
		this.setStudents(studentlist);
		
		//add this module to students in the list
		
		for(int i = 0; i<students.size(); i++) {
			students.get(i).addModule(this);
		}
		
	}


	public String getModuleName() {
		return moduleName;
	}


	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}


	public String getID() {
		return ID;
	}


	public void setID(String iD) {
		ID = iD;
	}
	
	public ArrayList<Student> getStudents() {
		return students;
	}


	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}


	public ArrayList<Course> getCourses() {
		return courses;
	}


	public void setCourses(ArrayList<Course> courses) {
		this.courses = courses;
	}
	
	public void addCourse(Course course) {
		this.courses.add(course);
	}
	
}
