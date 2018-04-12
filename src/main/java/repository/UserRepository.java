package repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import bean.User;

public interface UserRepository  extends CrudRepository<User, Long>{
	User findByEmail(String email);

	void deleteInBatch(List<User> users);
}