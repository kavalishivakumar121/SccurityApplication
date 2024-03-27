/**
 * 
 */
package com.app.security.service;

import java.util.List;

import com.app.security.dto.UserRegisterDto;

/**
 * 
 */
public interface UserIservice {
	
	public UserRegisterDto saveUser(UserRegisterDto dto);
	public List<UserRegisterDto> getAllUsers();

}
