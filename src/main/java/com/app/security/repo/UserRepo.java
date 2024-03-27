/**
 * 
 */
package com.app.security.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.security.entity.UserRegistrationEntity;

/**
 * 
 */
public interface UserRepo extends JpaRepository<UserRegistrationEntity, Integer> {

}
