package com.a;

import static org.hamcrest.CoreMatchers.nullValue;

import java.util.HashMap;

public class UserRepository {
	
	HashMap<String, User> users; // key -> name, value -> user
	
	public User getUserByName(String name) {
		if (users == null || !users.containsKey(name)) {
			return null;
		}
		
		return users.get(name);
	}
	
	public boolean deleteUser(String name) {
		if (users == null || !users.containsKey(name)) {
			return false;
		}
		
		users.remove(name);
		return true;
	}
	
	public User addUser(User user) {
		return updateUser(user);
	}
	
	public User updateUser(User user) {
		if (users == null) {
			users = new HashMap<>();
		}
		
		// put method either overwrites or add a new user
		return users.put(user.getName(), user);	
	}

}


