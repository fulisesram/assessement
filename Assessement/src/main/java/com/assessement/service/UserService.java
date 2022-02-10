package com.assessement.service;

import java.util.List;
import com.assessement.model.User;

public interface UserService {

	public List<User> listUser();
	public User findUser(User user);
	public void saveUser(User user);
	public void deleteUser(User user);
	
	
}
