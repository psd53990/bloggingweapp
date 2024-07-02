package com.blogapp.blog.services;

import java.util.List;

import com.blogapp.blog.payloads.UserDto;

public interface UserService {

	UserDto creatUser(UserDto user);
	
	UserDto updateUser(UserDto user,Integer userId);
	
	UserDto getUserById(Integer userId);
	
	List<UserDto> getAllUsers();
	
	void deleteUser (Integer userId);
}
