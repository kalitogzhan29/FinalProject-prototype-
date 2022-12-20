package Classes;

import java.sql.SQLException;
import java.util.ArrayList;

public class Lessons {
	int lessonId;
	String lessonName;
	Teacher teacher;
	LesonType type;
	
    public Lessons() {}
	
	public Lessons(int lessonId, String lessonName, Teacher teacher, LesonType type) {
		super();
		this.lessonId = lessonId;
		this.lessonName = lessonName;
		this.teacher = teacher;
		this.type = type;
	}
	
	public int getLessonId() {
		return lessonId;
	}
	
	public String getLessonName() {
		return lessonName;
	}
	
	public Teacher getTeacher() {
		return teacher;
	}
	
	public LesonType getType() {
		return type;
	}
	
	public boolean equals(Object o) {
		if(!super.equals(o)) return false;
		Lessons e = (Lessons)o;
		
		return e.lessonId == this.lessonId && e.lessonName == this.lessonName && this.teacher.equals(e.teacher);
	}
	
}
