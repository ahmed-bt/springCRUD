package app;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import app.User;

public interface UserRepository  extends CrudRepository<User, String>{
    List<User> findByName(String Name);
}