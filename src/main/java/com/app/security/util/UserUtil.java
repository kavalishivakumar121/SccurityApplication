/**
 * 
 */
package com.app.security.util;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.app.security.dto.UserRegisterDto;
import com.app.security.entity.UserRegistrationEntity;

/**
 * 
 */
@Component
public class UserUtil {
	
	public List<UserRegisterDto> entityTodto(List<UserRegistrationEntity> entity){
		
		return entity.stream()
				.map(records->new UserRegisterDto(records.getUserId(),records.getFirstName(),records.getMiddName(),records.getLastName(),records.getGender(),records.getUserEmail(),records.getUserPassword(),records.getUserRole()))
				.collect(Collectors.toList());
	}

}
