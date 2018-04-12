package service;

import bean.User;
import generic.GenericService;

public interface UserService extends GenericService<User> {

	boolean authenticate(String email, String password);
	
}
