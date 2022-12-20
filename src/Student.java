package Classes;

import java.util.Date;
import java.util.HashMap;
import java.util.Vector;

public class Student extends User implements Cloneable,Comparable <Student>{
	
	public String id;
	public AcademicDegree type;
	public Integer yearOfStudy;
	private double gpa;
	public Faculty faculty;
	int Total;
	int ratingCnt;
	
	HashMap <Course, Marks> marks = new HashMap <Course, Marks>();
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
	
	
	
	
	public void rateStation(int rating)
	{
	    this.Total = rating;
        this.ratingCnt++;
	}
	
	public int calcAvgRating(Teacher c)
	{   
		if (ratingCnt > 0)
	    {
	        double Rating = this.Total / this.ratingCnt;
	     
			return (int) Rating;}
		return 0;
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
	
}
