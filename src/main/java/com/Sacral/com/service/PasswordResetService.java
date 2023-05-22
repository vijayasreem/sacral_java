@Service
public class PasswordResetService {
    @Autowired
    private PasswordResetRepository passwordResetRepository;

    public UserAccount findByEmail(String email) {
        return passwordResetRepository.findByEmail(email);
    }

    public void savePasswordDetails(UserAccount user) {
        passwordResetRepository.savePasswordDetails(user);
    }

    public boolean validateNewPassword(String newPassword) {
        return passwordResetRepository.validateNewPassword(newPassword);
    }
}