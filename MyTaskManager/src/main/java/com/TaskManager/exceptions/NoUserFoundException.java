package com.TaskManager.exceptions;

public class NoUserFoundException extends RuntimeException {

	public NoUserFoundException() {
		super("No employees found");
	}

}