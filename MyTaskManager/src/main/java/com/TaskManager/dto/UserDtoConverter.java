package com.TaskManager.dto;

import com.TaskManager.entity.User;

public class UserDtoConverter {

	public static UserDTO toDTO(User user) {
		UserDTO userDto = new UserDTO();
		userDto.setId(user.getUser_Id());
		userDto.setName(user.getUser_Name());
		userDto.setEmail(user.getUser_Email());
		userDto.setPhoneNo(user.getUser_PhoneNo());
		return userDto;
	}
	
//	public static User toEntity(UserDTO userDto) {
//		
//	}
}
