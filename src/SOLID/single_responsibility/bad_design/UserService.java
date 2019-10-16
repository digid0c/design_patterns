package SOLID.single_responsibility.bad_design;

import java.util.regex.Pattern;

/**
 * createUser method violates single responsibility design principle as it tries to be in charge of:
 * 1. Mapping user data from array of strings to user entity.
 * 2. Validating user entity.
 * 3. Saving user entity directly into the storage.
 * 4. Processing incoming request (this is the only direct responsibility of this particular method).
 */
public class UserService {

    private UserStorage userStorage = new UserStorage();

    public boolean createUser(String[] userData) {
        User user = mapToUser(userData);
        boolean isValid = isValid(user);

        if (!isValid) {
            return false;
        }

        userStorage.save(user);
        return true;
    }

    private User mapToUser(String[] userData) {
        if (userData == null || userData.length != 3) {
            return new User();
        }
        return new User(userData[0], userData[1], userData[2]);
    }

    private boolean isValid(User user) {
        return user != null && isValidFirstName(user.getFirstName()) && isValidLastName(user.getLastName()) && isValidNickname(user.getNickname());
    }

    private boolean isValidFirstName(String firstName) {
        return firstName != null && Pattern.matches("^[a-zA-Z]{1,100}$", firstName);
    }

    private boolean isValidLastName(String lastName) {
        return lastName != null && Pattern.matches("^[a-zA-Z]{1,100}$", lastName);
    }

    private boolean isValidNickname(String nickname) {
        return nickname != null && Pattern.matches("^[a-zA-Z0-9_]{5,25}$", nickname);
    }
}
