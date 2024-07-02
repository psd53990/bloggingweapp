package com.blogapp.blog.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blogapp.blog.payloads.ApiResponse;
import com.blogapp.blog.payloads.UserDto;
import com.blogapp.blog.services.UserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/user")
public class UserController {

	@Autowired
	private UserService userService;
	
	//@Valid used for validation as we have applied on UserDto class
	@PostMapping("/")
	public ResponseEntity<UserDto> creatUser(@Valid @RequestBody UserDto userDto){
		
		UserDto createdUserDto = this.userService.creatUser(userDto);
		
		return new ResponseEntity<>(createdUserDto, HttpStatus.CREATED);
		
	}
	
	//@Valid used for validation as we have applied on UserDto class
	@PutMapping("/{userId}")
	public ResponseEntity<UserDto> updateUser(@Valid @RequestBody UserDto userDto,@PathVariable("userId") Integer uid){
		
		UserDto updatedUser = this.userService.updateUser(userDto, uid);
		return ResponseEntity.ok(updatedUser);
	}
	
	@DeleteMapping("/{userId}")
	public ResponseEntity<ApiResponse> deleteUser(@PathVariable("userId") Integer uid){
		
		this.userService.deleteUser(uid);
		return new ResponseEntity<ApiResponse>(new ApiResponse("User Deleted Successfully", true), HttpStatus.OK);
	}
	
	
	@GetMapping("/")
	public ResponseEntity<List<UserDto>> getAllUsers(){
		
		return ResponseEntity.ok(this.userService.getAllUsers());
	
	}
	@GetMapping("/{userId}")
	public ResponseEntity<UserDto> getSingleUsers(@PathVariable Integer userId){
		
		return ResponseEntity.ok(this.userService.getUserById(userId));
		
	}
	
	
}
