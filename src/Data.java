package Classes;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class Data implements Serializable{
	
	public static Object student;
	public static Object course;
	public static ArrayList<Student> studentlist = new ArrayList<Student>();
	public static ArrayList<String> courselist = new ArrayList<String>();
	public static HashMap <Course, Marks> marks = new HashMap <Course, Marks>();
	
	public void setStudentList(ArrayList<Student> students) {
		Data.studentlist = students;
	}
	
	public void setCousreList(ArrayList<String> courses) {
		Data.courselist = courses;
	}
	
	public static ArrayList<Student> getStudentList() {
		
		return studentlist;
	}
	
	public static ArrayList<String> getCourseList() {
		
		return courselist;
	}
	
}
