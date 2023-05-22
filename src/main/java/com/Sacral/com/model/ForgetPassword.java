package com.Sacral.com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ForgetPassword {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private String username;
	
	private String OTP;
	
	private String newPassword;
	
	private boolean isPasswordPolicy;
	
	private boolean isUsernameExists;
	
	private boolean isOTPToEmail;
	
	private boolean isStoreNewPassword;
	
	public ForgetPassword() {
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getOTP() {
		return OTP;
	}

	public void setOTP(String oTP) {
		OTP = oTP;
	}

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
	}

	public boolean isPasswordPolicy() {
		return isPasswordPolicy;
	}

	public void setPasswordPolicy(boolean isPasswordPolicy) {
		this.isPasswordPolicy = isPasswordPolicy;
	}

	public boolean isUsernameExists() {
		return isUsernameExists;
	}

	public void setUsernameExists(boolean isUsernameExists) {
		this.isUsernameExists = isUsernameExists;
	}

	public boolean isOTPToEmail() {
		return isOTPToEmail;
	}

	public void setOTPToEmail(boolean isOTPToEmail) {
		this.isOTPToEmail = isOTPToEmail;
	}

	public boolean isStoreNewPassword() {
		return isStoreNewPassword;
	}

	public void setStoreNewPassword(boolean isStoreNewPassword) {
		this.isStoreNewPassword = isStoreNewPassword;
	}
	
	

}