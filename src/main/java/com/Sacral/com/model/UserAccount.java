package com.Sacral.com.model;

public class UserAccount {
    private String email;
    private String password;
    private boolean passwordComplexityMet;

    public UserAccount(String email, String password, boolean passwordComplexityMet) {
        this.email = email;
        this.password = password;
        this.passwordComplexityMet = passwordComplexityMet;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isPasswordComplexityMet() {
        return this.passwordComplexityMet;
    }

    public void setPasswordComplexityMet(boolean passwordComplexityMet) {
        this.passwordComplexityMet = passwordComplexityMet;
    }
}