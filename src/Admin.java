package Classes;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;

public class Admin extends User implements SeeUserAction, ManageUser, Update{
		int UserId;
		Admin(String name, String surname, String fathername, String login, String password, String email, Date dateofBirthday, Gender g, int id){
			super();
			this.UserId = id;
			
		}
		
		LinkedList <String> allName = new LinkedList<String>();
		LinkedList <String> allSurname = new LinkedList<String>();
		LinkedList <Integer> allId = new LinkedList<Integer>();
		
		public void addNewUser(Object o) {							// add a new user in a data
			if(!checkUser(o) && userRegistrationNotification(o)) {
				Admin otherUser = (Admin) o;
				allName.add(otherUser.name);
				allSurname.add(otherUser.surname);
				allId.add(otherUser.UserId);
				System.out.println("A new user added");
			}
			else {
				System.out.println("Such user exists in a data");
			}
		}
		
		public void deleteUser(Object o) {									// delete a user in a data
			if(checkUser(o)) {
				Admin otherUser = (Admin) o;
				allName.remove(otherUser.name);
				allSurname.add(otherUser.surname);
				allId.add(otherUser.UserId);
				System.out.println("This user successfully deleted");
			}
			else {
				System.out.println("This user does not exist in a data");
			}
		}
		
		public boolean checkUser(Object o) {											//checker for a new person
			if (this == o) return true;
			if (o == null || getClass() != o.getClass()) return false;
			
			boolean newName = false, newSurname = false, newId = false; 
			Admin otherUser = (Admin) o;
			
				if(allName.size() != 0) {												// Check if this person exists
					for(int j = 0; j <= allName.size(); j++) {							// Check cloning
						if(allName.get(j) == otherUser.name) {
							newName = true;
						}
						if(allSurname.get(j) == otherUser.surname) {
							newSurname = true;
						}
						if(allId.get(j) == otherUser.UserId) {
							newId = true;
						}
					}
				}
				
				if(newName == false && newSurname == false && newId == false) {
					return false;
				}
				else if(newName == true && newSurname == false && newId == false) {
					return false;
				}
				else if(newName == false && newSurname == true && newId == false) {
					return false;
				}
				else {
					return true;
				}
		}																				//end of the checking
		
		
			public void upgradeWSP() {
				
			}
			
			public void showUserList() { 												// method to show all users
				System.out.println("Name: \t Surname: \t Id:");
				for(int i = 0; i < allName.size(); i++) {
					System.out.println(allName.get(i)+"\t"+ allSurname.get(i) +"\t" + allId.get(i)) ;
				}
			}
			
			
			// The end of Admin class 
			
			String userDescription;

			@Override
			public HashMap<Integer, String> getInfo() {
				// TODO Auto-generated method stub
				return data;
			}

			@Override
			public void viewUserInfo() {
				// TODO Auto-generated method stub
				for(int i = 0; i < data.size(); i++) {
					if(name == data.getOrDefault(UserId, name)){
						System.out.println(data.getOrDefault(UserId, name));
					}
				}
			}

			@Override
			public HashMap<Integer, String> updateInfo(int key, String str) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean userRegistrationNotification(Object o) {
				// TODO Auto-generated method stub
				if(o != null) {
					return true;
				}
				
				
				return false;
			}

			@Override
			public boolean findUserById(int id) {
				// TODO Auto-generated method stub
				for(int i = 0; i < allId.size(); i++) {
					if (allId.get(i) == id) {
						return true;
					}
				}
				return false;
			}

			@Override
			public void showUserAction() {
				// TODO Auto-generated method stub
				
			}
			
			
			
			
			
			
		
}
