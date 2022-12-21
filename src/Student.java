package Classes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Vector;

public class Student extends User implements java.io.Serializable,Cloneable,Comparable <Student>, StudentInterface{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String id;
	public AcademicDegree type;
	public Integer yearOfStudy;
	private double gpa;
	public Faculty faculty;
	int Total;
	int ratingCnt;
	
	ArrayList <Course> studentCourselist = new ArrayList <Course>();
	Vector <Organizations> member = new Vector <Organizations>();
	
	Student(){}
	
	Student (String id, String name, String surname, String fathername, String login, String password, String email, Date dateofBirthday, Gender g, AcademicDegree type, Integer year, Faculty faculty){
		super(name, surname, fathername, login, password, email, dateofBirthday, g);
		this.id = id;
		this.type = type;
		this.yearOfStudy = year;
		this.faculty = faculty;
		
	}
	
	public String getId() {
		return id;
	}
	
	public Integer getYearOfStudy() {
		return yearOfStudy;
	}
	
	public Faculty getFaculty() {
		return faculty;
	}
	
	public AcademicDegree getDegree() {
		return type;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setYear(Integer year) {
		this.yearOfStudy = year;
	} 
	
	public void doRequest(RequestsForStudents inquiry) throws IOException {
		
		int cnt = 1;
		Vector <String> history = new Vector <String>();
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String language = null;
		String semester = null;
        String form = null;
		
	if (inquiry == RequestsForStudents.APP_ACADEMIC_MOBILITY) {
	    System.out.println("Enter the type of inquiry:"+inquiry);
	    System.out.println("\nEnter the language of inquiry:"); 
	    language = input.readLine(); }
	
	else if (inquiry == RequestsForStudents.MILITARY_COMMITTEE) {
	    System.out.println("Enter the type of inquiry:"+inquiry);
	    System.out.println("\nEnter city and region:");
	    String city = input.readLine();
	}
		
	else if (inquiry == RequestsForStudents.TRANSCRIPT_FOR_ALL) {
	    System.out.println("Enter the type of inquiry:"+inquiry);
	    System.out.println("\nEnter the language of inquiry:");
	    language = input.readLine();
	    System.out.println("\nEnter form of inquiry:");
	    form = input.readLine();
	}
	
	else if (inquiry == RequestsForStudents.TRANSCRIPT_FOR_SEMESTER) {
		System.out.println("Enter the type of inquiry:"+inquiry);
	    System.out.println("\nEnter the language of inquiry:");
	    language = input.readLine();
		System.out.println("\nEnter the semester:");
		semester = input.readLine();
	    System.out.println("\nEnter form of inquiry:");
	    form = input.readLine();
	}
	
	else if (inquiry == RequestsForStudents.TRANSCRIPT_FOR_YEAR) {
		 System.out.println("Enter the type of inquiry:"+inquiry);
		 System.out.println("\nEnter the language of inquiry:");
		 language = input.readLine();
		 System.out.println("\nEnter form of inquiry:");
		 form = input.readLine();
		 System.out.println("\nEnter year:");
		 String year = input.readLine();
	}
	
	Date date = new Date();
	
	String transform_cnt = Integer.toString(cnt);
	String status = inquiry+"."+date+"."+language+"."+semester+"."+form;
	history.add(transform_cnt + this.name + this.surname + this.fathername+this.id+" " + status);
	cnt++;
	
	}
	
	 public void viewInfoAboutTeacher(Teacher s2) {
		 System.out.println("ID:" + s2.getlecturerId()+"\nLogin:"+s2.getLogin()+"\nSurname:"+s2.getLastName()+"\nName:"+s2.getName()+
					"\nFathername:"+s2.getFatherName()+"\nDate of birth:"+s2.dateofBirthday()+"\nEmail:"+s2.getEmail()+"Type:"+s2.getType());
	 }
	 

	public Object clone() throws CloneNotSupportedException {
		Student s = (Student)super.clone();
		return s;
	}

	@Override
	public int compareTo(Student st) {
		
		if(st.gpa > this.gpa) return 1;
		if(st.gpa < this.gpa) return -1;
		return 0;
	}

	@Override
	public void view(Object o) {
		Student s1 = (Student)o;
		
		System.out.println("Student name:"+s1.getName()+"\nStudent Surname:"+s1.getLastName()+"\nStudent FatherName:"+s1.getFatherName()+
				"\nDate of birth:"+s1.dateofBirthday()+"\nEmail:"+s1.getEmail()+"\nFaculty:"+s1.getFaculty());
	}

	@Override
	public void studentViewAllCourses() {
		System.out.println(Database.courseArrayList);
	}

	@Override
	public void registerToCourse() throws IOException {
		Course course = new Course();
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter courseID: ");
		String courseID = input.readLine();
		
		System.out.println("Enter StudentInfo: ");
		String Fullname = input.readLine();
		String StudentID = input.readLine();
		String StudentInfo = Fullname + "," + StudentID;
		
		
		for (int i = 0; i<Data.studentlist.size(); i++) {
			Student student = Data.studentlist.get(i);
			
			if (student.getName().equals(Fullname) && student.getId().equals(StudentID)) {
				for (int j = 0; j<Database.courseArrayList.size(); j++) {
					course = Database.courseArrayList.get(j);
					
					if (courseID.equals(course.getCourseID())) {
						course.AddStudent(StudentInfo);
					}
			}
		}
			Data.courselist.add(courseID);
	}}
	
	@Override
	public void withdrawFromCourse() throws IOException {
		Course course = new Course();
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter courseID: ");
		String courseID = input.readLine();
		
		System.out.println("Enter StudentInfo: ");
		String Fullname = input.readLine();
		String StudentID = input.readLine();
		String StudentInfo = Fullname + "," + StudentID;
		
		for (int i = 0; i<Data.studentlist.size(); i++) {
			Student student = Data.studentlist.get(i);
			
			if (student.getName().equals(Fullname) && student.getId().equals(StudentID)) {
				for (int j = 0; j<Database.courseArrayList.size(); j++) {
					course = Database.courseArrayList.get(j);
					
					if (courseID.equals(course.getCourseID())) {
						course.RemoveStudent(StudentInfo);
					}
			}
		}
			Data.courselist.remove(courseID);
	}}
		

	@Override
	public void viewAllRegisteredCourses() {
		System.out.println(Data.courselist.toString());
		
	}
	
	
}

