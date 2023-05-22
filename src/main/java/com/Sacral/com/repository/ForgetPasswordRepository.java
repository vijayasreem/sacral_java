@Repository
public interface ForgetPasswordRepository {
 
    void forgetPassword(String username);
 
    void otpVerify(String OTP);
 
    void changePassword(String newPassword);
 
    boolean checkPasswordPolicy(String newPassword);
 
    boolean checkUsernameExists(String username);
 
    boolean sendOTPToEmail(String OTP);
 
    boolean storeNewPassword(String newPassword);
}