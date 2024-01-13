package com.TaskManager.exceptions;

public class UserNotFoundWithName extends RuntimeException{

	public UserNotFoundWithName(String name) {
		super("No user found with name: " + name);
}
}
