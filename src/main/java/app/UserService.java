package app;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRespository;

//	private List<User> users =new ArrayList<>( Arrays.asList(new User("java", "fijfeo", 252), new User("c++", "fijdzdzdfeo", 285),
//			new User("c", "fizdzdjfeo", 125252)
//
//	));

	public List<User> getAllUsers() {
		//return users;
		List<User> users = new ArrayList<>();
		userRespository.findAll().forEach(users::add);
		return users;
	}

	public User getUser(String name) {
		//return users.stream().filter(t -> t.getName().equals(name)).findFirst().get();
		return userRespository.findOne(name);
	}

	public void addUser(User user) {
		userRespository.save(user);
	}

	public void updateUser(String name, User user) {
//		for(int i=0; i<users.size(); i++) {
//			User usr=users.get(i);
//			if(usr.getName().equals(name)) {
//				users.add(i, user);
//				return;
//			}
//		}
		userRespository.save(user);
		
	}

	public void deleteUser(String name) {
//		users.removeIf(t -> t.getName().equals(name));
		userRespository.delete(name);
	}

}
