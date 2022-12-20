package Classes;

import java.util.Vector;

public class Teacher extends Employee {
	   String lecturerId;
       Teachers type;
       Faculty faculty;
       AcademicDegree degree;
       Vector <Course> course = new Vector <Course>();
       
       Teacher (){
       }
       
       Teacher(String name, String surname, String login, String password, String email, double salary, Teachers type, Faculty f, AcademicDegree d, String lecturerId){
    	   this.type = type;
    	   this.faculty =f;
    	   this.degree =d;
    	   this.lecturerId = lecturerId;
       }
       
       public Teachers getType() {
    	   return type;
       }
       
       public String getlecturerId() {
    	   return lecturerId;
       }
       
       
}
