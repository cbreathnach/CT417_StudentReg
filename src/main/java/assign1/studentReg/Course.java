package assign1.studentReg;

import java.util.ArrayList;

import org.joda.time.LocalDate;

public class Course {
	
	private String courseName;
	private LocalDate startDate;
	private LocalDate endDate;
	
	private ArrayList<Student> students = new ArrayList<Student>();
	private ArrayList<Module> modules = new ArrayList<Module>();

	public Course (String name, ArrayList<Module> modulelist, LocalDate start, LocalDate end) {
		
		this.setCourseName(name);
		this.setModules(modulelist);
		this.setStartDate(start);
		this.setEndDate(end);
		
		//add details to module and student objects
		for(int i = 0; i<modules.size(); i++) {
			
			//add course to module object here - may be more than one course per module
			modules.get(i).addCourse(this);
			
			//loop over students in each module and each student data to them
			for(int j = 0; j< modules.get(i).getStudents().size() ; j++) {
				
				//skip if student has been allocated a course already 
				if (modules.get(i).getStudents().get(j).getCourse() == null) {   
					
					//add course to students objects and add students to this course object
					modules.get(i).getStudents().get(j).setCourse(this);
					this.students.add(modules.get(i).getStudents().get(j));
				}
			}
		}
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public LocalDate getStartDate() {
		return startDate;
	}

	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}

	public LocalDate getEndDate() {
		return endDate;
	}

	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}
	
	public ArrayList<Student> getStudents() {
		return students;
	}

	public void setStudents(ArrayList<Student> students) {
		this.students = students;
	}
	
	public ArrayList<Module> getModules() {
		return modules;
	}

	public void setModules(ArrayList<Module> modules) {
		this.modules = modules;
	}
}
