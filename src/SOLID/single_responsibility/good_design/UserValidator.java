package SOLID.single_responsibility.good_design;

import java.util.regex.Pattern;

/**
 * UserValidator is in charge of validating user entity.
 */
public class UserValidator {

    public boolean isValid(User user) {
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
