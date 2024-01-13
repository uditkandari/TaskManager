package com.TaskManager.exceptions;

public class UserNotFoundWithIDException extends RuntimeException{

	public UserNotFoundWithIDException(Long id) {
		super("User not found with id " + id);
	}
}
