/**
 * 
 */
package com.app.security.entity;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.Table;

/**
 * 
 */
@Entity
@Table(name="UserRegistration")
public class UserRegistrationEntity {

	@Id
	@GeneratedValue
	private Integer userId;
	private String firstName;
	private String lastName;
	private String middName;
	private String gender;
	private String userEmail;
	private String userPassword;
	@ElementCollection(fetch = FetchType.EAGER)
	@JoinTable(name = "user_roles",joinColumns = @JoinColumn(referencedColumnName = "userId"))
	@Column(name="roles")
	private Set<String> userRole;
	/**
	 * @return the userId
	 */
	public Integer getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the middName
	 */
	public String getMiddName() {
		return middName;
	}
	/**
	 * @param middName the middName to set
	 */
	public void setMiddName(String middName) {
		this.middName = middName;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the userEmail
	 */
	public String getUserEmail() {
		return userEmail;
	}
	/**
	 * @param userEmail the userEmail to set
	 */
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	/**
	 * @return the userPassword
	 */
	public String getUserPassword() {
		return userPassword;
	}
	/**
	 * @param userPassword the userPassword to set
	 */
	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	/**
	 * @return the userRole
	 */
	public Set<String> getUserRole() {
		return userRole;
	}
	/**
	 * @param userRole the userRole to set
	 */
	public void setUserRole(Set<String> userRole) {
		this.userRole = userRole;
	}
	/**
	 * 
	 */
	public UserRegistrationEntity() {
		super();
	}
	@Override
	public String toString() {
		return "UserRegistrationEntity [userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", middName=" + middName + ", gender=" + gender + ", userEmail=" + userEmail + ", userPassword="
				+ userPassword + ", userRole=" + userRole + "]";
	}
	
}
