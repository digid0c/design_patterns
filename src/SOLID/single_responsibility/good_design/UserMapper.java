package SOLID.single_responsibility.good_design;

/**
 * UserMapper is in charge of mapping user data from array of strings to user entity.
 */
public class UserMapper {

    public User mapToUser(String[] userData) {
        if (userData == null || userData.length != 3) {
            return new User();
        }
        return new User(userData[0], userData[1], userData[2]);
    }
}
