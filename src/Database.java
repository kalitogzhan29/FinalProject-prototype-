package Classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.ArrayList;

public class Database implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static ArrayList<Course> courseArrayList = new ArrayList<Course>();
	
	public static ArrayList<Course> courseList() throws IOException{
		
		ArrayList<Course> courses = new ArrayList<Course>();
		
		try {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		while (input.readLine() != null) {
			
			String CourseName = input.readLine();
			String CourseID = input.readLine();
			String Teacher = input.readLine();
			Integer credits = Integer.parseInt(input.readLine());
			String prereq = input.readLine();
			String info = input.readLine();
			
			Course c = new Course(CourseName, CourseID, Teacher, credits, prereq, info);
			
			courses.add(c);
		}}
		
		catch (IOException ex) {
			ex.printStackTrace();
		}
		
		courseArrayList = courses;
		
		return courseArrayList;
	}
		

}
