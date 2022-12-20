package Classes;

import java.util.Vector;

public class Course {
	
	public String courseName;
	public String courseID;
	public Integer credits;
	public String prerequisite;
	private CourseFiles files;
	public String info;
	Vector <Lessons> schedule = new Vector <Lessons>();
	
	Course(){
		
	}
	
	Course(String coursename, String courseID, Integer credits, String prereq, String info){
		this.courseName = coursename;
		this.courseID = courseID;
		this.credits = credits;
		this.prerequisite = prereq;
		this.info = info;
	}
	
	public String getCoursename() {
		return courseName;
	}
	
	public String getCourseID() {
		return courseID;
	}
	
	public Integer getCredits() {
		return credits;
	}
	
	public String getPrereq() {
		return prerequisite;
	}
	
	public String getInfo() {
		return info;
	}

}
