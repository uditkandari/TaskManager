package com.TaskManager.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.TaskManager.entity.User;

public interface UserRepo extends JpaRepository<User, Long> {
	
	@Query("SELECT u FROM User u WHERE u.user_Name = ?1")
	List<User> findByName(String name);

}
