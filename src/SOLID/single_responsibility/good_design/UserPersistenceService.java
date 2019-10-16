package SOLID.single_responsibility.good_design;

/**
 * UserPersistenceService is in charge of CRUD operations related to user entity. Ideally, this should be
 * the only class being able to communicate with users storage.
 */
public class UserPersistenceService {

    private UserStorage userStorage = new UserStorage();

    public void save(User user) {
        userStorage.save(user);
    }
}
