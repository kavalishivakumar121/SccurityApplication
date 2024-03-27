/**
 * 
 */
package com.app.security.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.security.dto.UserRegisterDto;
import com.app.security.service.UserIservice;
import com.app.security.util.UserUtil;

/**
 * 
 */
@RestController
@RequestMapping("/user")
public class UserRegisterController {

	
	private UserIservice service;
	public UserRegisterController(UserIservice service) {
		this.service=service;
	}
	@GetMapping("/")
	public String welcomeMsg() {
		return "welocme to User Registration Page";
	}
	@PostMapping("/v1/save")
	public ResponseEntity<UserRegisterDto> saveUser(@RequestBody UserRegisterDto dto){
		
		UserRegisterDto saveUser = service.saveUser(dto);
		
		return new ResponseEntity<UserRegisterDto>(saveUser,HttpStatus.CREATED);
	}
	
	@GetMapping("/v1/getAll")
	public ResponseEntity<List<UserRegisterDto>> getAllUsers(){
		List<UserRegisterDto> allUsers = service.getAllUsers();
		
		return new ResponseEntity<List<UserRegisterDto>>(allUsers,HttpStatus.OK);
	}
	
}
