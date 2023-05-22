package com.Sacral.com.controller;

import com.Sacral.com.model.UserAccount;
import com.Sacral.com.service.PasswordResetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/passwordreset")
public class PasswordResetController {
    @Autowired
    private PasswordResetService passwordResetService;

    @GetMapping("/findByEmail")
    public UserAccount findByEmail(String email) {
        return passwordResetService.findByEmail(email);
    }

    @PostMapping("/savePasswordDetails")
    public void savePasswordDetails(@RequestBody UserAccount user) {
        passwordResetService.savePasswordDetails(user);
    }

    @PostMapping("/validateNewPassword")
    public boolean validateNewPassword(String newPassword) {
        return passwordResetService.validateNewPassword(newPassword);
    }
}