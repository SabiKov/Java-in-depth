package net.ddns.sabi11.thrillio.dao;

import net.ddns.sabi11.thrillio.DataStore;
import net.ddns.sabi11.thrillio.entities.User;

public class UserDao {

	public User[] getUsers() {
		
		return DataStore.getUsers();
	}
	
	
}
