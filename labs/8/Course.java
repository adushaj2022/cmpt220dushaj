package dushaj8;

import java.util.ArrayList;

public class Course {
	private String courseName;
	private ArrayList <String> students = new ArrayList<String>();
	
	
	public Course(String courseName) {
		this.courseName = courseName;
	}
	
	public void addStudent(String student) {
		students.add(student);
	}

	public String getCourseName() {
		return courseName;
	}

	public String[] getStudents() {
		return (String[])students.toArray();
	}

	public int getNumberOfStudents() {
		return students.size();
	}
	
	public void dropStudent(String student) {
		students.remove(student);
			}
	@Override
	public String toString(){
		String s = "";
		s = courseName + "(" + students.size() + "students)\n";
		for(int i = 0; i < students.size(); i++) {
			s += "(" + (i+1) + ")" + students.get(i)+ "\n";
		}
		return s;
		
	}
	{
	}


}
