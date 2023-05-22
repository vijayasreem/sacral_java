@Repository
public interface PasswordResetRepository {
    // Method to retrieve a user's account based on their registered email address
    UserAccount findByEmail(String email);

    // Method to save the updated password details
    void savePasswordDetails(UserAccount user);

    // Method to validate if the new password meets the minimum complexity requirements
    boolean validateNewPassword(String newPassword);
}