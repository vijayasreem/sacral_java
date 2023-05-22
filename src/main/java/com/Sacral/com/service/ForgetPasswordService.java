package com.Sacral.com.service;

import com.Sacral.com.repository.ForgetPasswordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ForgetPasswordService {
 
    @Autowired
    private ForgetPasswordRepository forgetPasswordRepository;
 
    public void forgetPassword(String username) {
        forgetPasswordRepository.forgetPassword(username);
    }
 
    public void otpVerify(String OTP) {
        forgetPasswordRepository.otpVerify(OTP);
    }
 
    public void changePassword(String newPassword) {
        forgetPasswordRepository.changePassword(newPassword);
    }
 
    public boolean checkPasswordPolicy(String newPassword) {
        return forgetPasswordRepository.checkPasswordPolicy(newPassword);
    }
 
    public boolean checkUsernameExists(String username) {
        return forgetPasswordRepository.checkUsernameExists(username);
    }
 
    public boolean sendOTPToEmail(String OTP) {
        return forgetPasswordRepository.sendOTPToEmail(OTP);
    }
 
    public boolean storeNewPassword(String newPassword) {
        return forgetPasswordRepository.storeNewPassword(newPassword);
    }
}