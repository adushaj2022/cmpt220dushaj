package dushajSeven;

public class Course {
	    private String courseName;
	    private String[] students = new String[30];
	    private int numberOfStudents;

	    public Course(String courseName) {
	        this.courseName = courseName;
	    }

	    public void addStudent(String student) {
	        // 1.
	        if(numberOfStudents == students.length) {
	            String[] copy = new String[students.length + 5];
	            for(int i = 0; i < students.length; ++i) {
	                copy[i] = students[i];
	            }
	            students = copy;
	        }
	        students[numberOfStudents++] = student;
	    }

	    // 2
	    public void clear() {
	        numberOfStudents = 0;
	    }

	    public String getCourseName() {
	        return courseName;
	    }

	    public String[] getStudents() {
	        return students;
	    }

	    public int getNumberOfStudents() {
	        return numberOfStudents;
	    }

	    public void dropStudent(String student) {
	        for (int i = 0; i < numberOfStudents; i++) {
	            if (students[i].equals(student)) {
	                for (int j = i + 1; j < numberOfStudents; j++)
	                    students[j - 1] = students[j];
	                numberOfStudents--;
	                return;
	            }
	        }
	    }
	}

	class TestCourse {

	    public static void main(String[] args) {
	        Course course = new Course("CS");
	       
	        course.addStudent("Rick");
	        
	        course.addStudent("Owen");
	        
	        course.addStudent("Raf");
	        
	        course.dropStudent("Raf");
	        // display students
	        System.out.println("Students in the course are");
	        for(int i = 0; i < course.getNumberOfStudents(); ++i) {
	            System.out.println(course.getStudents()[i]);
	        }
	    }


}
