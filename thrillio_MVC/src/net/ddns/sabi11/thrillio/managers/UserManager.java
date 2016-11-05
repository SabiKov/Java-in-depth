package net.ddns.sabi11.thrillio.managers;

import net.ddns.sabi11.thrillio.dao.UserDao;
import net.ddns.sabi11.thrillio.entities.User;

public class UserManager {

	//Create a single instance of this class
	private static UserManager instance = new UserManager();
	private static UserDao dao = new UserDao();
	

	// Singleton Pattern - only one object can be created
	private UserManager() {

	}

	//Returns a single instance of single UserManager 
	public static UserManager getInstance() {

		return instance;
	}

	//Method for creating a new user object passing all parameters to the setters
	public User createUser(
			long id
			, String email
			, String password
			, String firstName
			, String lastName
			, int gender
			, String usertype) {

		User user = new User();
		user.setId(id);
		user.setEmail(email);
		user.setPassword(password);
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setGender(gender);
		user.setUserType(usertype);
		
		return user;
	}
	
	//Calling the getUsers 
	public User[] getUsers() {
		
		return dao.getUsers();
	}

}
