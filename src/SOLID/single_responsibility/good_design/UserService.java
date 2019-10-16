package SOLID.single_responsibility.good_design;

/**
 * Now createUser method is responsible for processing request only. It delegates related responsibilities
 * to relevant classes.
 */
public class UserService {

    private UserMapper userMapper = new UserMapper();
    private UserValidator userValidator = new UserValidator();
    private UserPersistenceService userPersistenceService = new UserPersistenceService();

    public boolean createUser(String[] userData) {
        User user = userMapper.mapToUser(userData);
        boolean isValid = userValidator.isValid(user);

        if (!isValid) {
            return false;
        }

        userPersistenceService.save(user);
        return true;
    }
}
