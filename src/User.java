package Classes;

import java.util.Date;

public abstract class User{
	
	String name;
	String surname;
	String login;
	String password;
	String email;
	String fathername;
	Date dateofBirthday;
	Gender g;
	
	
	User(){}

	
	User(String name, String surname, String fathername, String login, String password, String email, Date dateofBirthday, Gender g){
		this.name = name;
		this.surname = surname;
		this.fathername = fathername;
		this.login = login;
		this.password = password;
		this.email = email;
		this.dateofBirthday = dateofBirthday;
		this.g = g;
	}
	
	public String getName() {
		return name;
	}
	
	public String getLastName() {
		return surname;
	}
	
	public String getFatherName() {
		return fathername;
	}
	
	public Date dateofBirthday() {
		return dateofBirthday;
	}
	
	public Gender getGender() {
		return g;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setLogin(String login) {
		if(login == this.login) {
		this.login = login;}
	}
	
	public void setPassword(String password) {
		if(password == this.password) {
		this.password = password;}
	}
	
	public String getLogin() {
		return login;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void LogIn() {
		getLogin();
		getPassword();
	}
}
