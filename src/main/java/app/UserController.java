package app;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestMethod;

@RestController

public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping("/users")
	public List<User> getAll() {
		return userService.getAllUsers();

	}

	@RequestMapping("users/{name}")
	public User getUser(@PathVariable String name) {
		return userService.getUser(name);

	}

	@RequestMapping(method = RequestMethod.POST, value = "/users")
	public void addUser(@RequestBody User user) {
		userService.addUser(user);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/users/{name}")
	public void updateUser(@RequestBody User user, @PathVariable String name) {
		userService.updateUser(name, user);
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/users/{name}")
	public void deleteUser(@PathVariable String name) {
		userService.deleteUser(name);
	}

}