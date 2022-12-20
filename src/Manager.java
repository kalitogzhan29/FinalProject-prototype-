package Classes;

import java.util.ArrayList;
import java.util.Date;


public class Manager extends Employee {
	ManagerType type;
	
	public Manager (String name,String lastName,String fatherName, String login,String password, String email, double salary, Date date, Gender g, ManagerType type) {
		super(name, lastName, fatherName, login,password, email, date, g, salary);
		this.type=type;
	}
	
    }
	
