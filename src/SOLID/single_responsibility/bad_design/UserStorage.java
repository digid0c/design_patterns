package SOLID.single_responsibility.bad_design;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class UserStorage {

    private static final Map<String, User> STORAGE = new ConcurrentHashMap<>();

    public void save(User user) {
        STORAGE.put(user.getNickname(), user);
    }

    public User get(String userNickname) {
        return STORAGE.get(userNickname);
    }
}
