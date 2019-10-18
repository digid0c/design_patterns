package SOLID.interface_segregation.good_design;

import java.util.List;

/**
 * UserPersistenceService declares methods associated with User entity only. That way there is no need to implement
 * unrelated methods by throwing an exception.
 */
public interface UserPersistenceService extends PersistenceService<User> {

    List<User> findByName(String name);

    List<User> findByAge(Integer age);
}
