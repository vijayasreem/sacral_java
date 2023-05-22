package com.Sacral.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Sacral.com.service.ForgetPasswordService;

@RestController
@RequestMapping("/forgetPassword")
public class ForgetPasswordController {
 
    @Autowired
    private ForgetPasswordService forgetPasswordService;
 
    @PostMapping("/forget")
    public void forgetPassword(@RequestBody String username) {
        forgetPasswordService.forgetPassword(username);
    }
 
    @PostMapping("/otpVerify")
    public void otpVerify(@RequestBody String OTP) {
        forgetPasswordService.otpVerify(OTP);
    }
 
    @PostMapping("/change")
    public void changePassword(@RequestBody String newPassword) {
        forgetPasswordService.changePassword(newPassword);
    }
 
    @PostMapping("/checkPasswordPolicy")
    public boolean checkPasswordPolicy(@RequestBody String newPassword) {
        return forgetPasswordService.checkPasswordPolicy(newPassword);
    }
 
    @PostMapping("/checkUsernameExists")
    public boolean checkUsernameExists(@RequestBody String username) {
        return forgetPasswordService.checkUsernameExists(username);
    }
 
    @PostMapping("/sendOTPToEmail")
    public boolean sendOTPToEmail(@RequestBody String OTP) {
        return forgetPasswordService.sendOTPToEmail(OTP);
    }
 
    @PostMapping("/storeNewPassword")
    public boolean storeNewPassword(@RequestBody String newPassword) {
        return forgetPasswordService.storeNewPassword(newPassword);
    }
}