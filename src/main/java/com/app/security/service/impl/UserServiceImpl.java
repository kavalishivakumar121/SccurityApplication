/**
 * 
 */
package com.app.security.service.impl;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.security.dto.UserRegisterDto;
import com.app.security.entity.UserRegistrationEntity;
import com.app.security.repo.UserRepo;
import com.app.security.service.UserIservice;
import com.app.security.util.UserUtil;

/**
 * 
 */
@Service
public class UserServiceImpl implements UserIservice{

	Logger log=LoggerFactory.getLogger(UserServiceImpl.class);
	@Autowired
	private UserUtil util;
	private UserRepo repo;
	public UserServiceImpl(UserRepo repo) {
		this.repo=repo;
	}
	public UserRegisterDto saveUser(UserRegisterDto dto) {
		// TODO Auto-generated method stub
		UserRegistrationEntity entity=new UserRegistrationEntity();
		entity.setFirstName(dto.getFirstName());
		entity.setLastName(dto.getLastName());
		entity.setGender(dto.getGender());
		entity.setMiddName(dto.getMiddName());
		entity.setUserEmail(dto.getUserEmail());
		entity.setUserPassword(dto.getUserPassword());
		entity.setUserRole(dto.getUserRole());
		repo.save(entity);
		dto.setUserId(entity.getUserId());
		return dto;
	}
	public List<UserRegisterDto> getAllUsers() {
		List<UserRegistrationEntity> findAll = repo.findAll();
		return util.entityTodto(findAll);
	}
}
