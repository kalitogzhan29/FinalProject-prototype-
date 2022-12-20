package Classes;

import java.util.HashMap;

public class CourseFiles {
	
	String books;
	
	HashMap <Course, String> files = new HashMap <Course, String>();
	
	
	public String getBooks() {
		return books;
	}
	
	public void addFiles(Course name) {
		files.put(name, getBooks());
	}
	
	public void deleteFiles(Course name) {
		files.remove(name);
	}
}
