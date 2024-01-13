package com.TaskManager.service;

import java.lang.StackWalker.Option;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TaskManager.entity.User;
import com.TaskManager.exceptions.NoUserFoundException;
import com.TaskManager.exceptions.UserNotFoundWithIDException;
import com.TaskManager.exceptions.UserNotFoundWithName;
import com.TaskManager.repo.UserRepo;

@Service
public class UserService {

	@Autowired
	UserRepo userRepo;
	
	public User createUser(User user) {
		return userRepo.save(user);
	}
	
	public List<User> getAllUsers() {
		List<User> users = userRepo.findAll();
		if (users.isEmpty()) {
			throw new NoUserFoundException();
		}
		return users;
	}
	
	
	public User getUserById(Long id) {
		return userRepo.findById(id).orElseThrow(()-> new UserNotFoundWithIDException(id));
	}
	
	public void deleteUser(Long id) {
		if(userRepo.existsById(id)) {
			userRepo.deleteById(id);
		}else {
			throw new UserNotFoundWithIDException(id);
		}
	}
	
	public List<User> getUsersByName(String name) {
		List<User> users = userRepo.findByName(name);
		if (users.isEmpty()) {
			throw new UserNotFoundWithName(name); 
		} else {
			return users;
		}
	}
}
