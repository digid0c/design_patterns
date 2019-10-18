package SOLID.interface_segregation.bad_design;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class UserPersistenceService implements PersistenceService<User> {

    private static final Map<Long, User> STORAGE = new ConcurrentHashMap<>();

    @Override
    public User findById(Long id) {
        return STORAGE.get(id);
    }

    @Override
    public void save(User entity) {
        STORAGE.put(entity.getId(), entity);
    }

    @Override
    public void delete(Long id) {
        STORAGE.remove(id);
    }

    @Override
    public List<User> findByName(String name) {
        return STORAGE.values().stream()
                .filter(user -> user.getName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }

    @Override
    public List<User> findByAge(Integer age) {
        return STORAGE.values().stream()
                .filter(user -> user.getAge() == age)
                .collect(Collectors.toList());
    }

    @Override
    public List<User> findByTotalCost(Double totalCost) {
        throw new UnsupportedOperationException("User persistence service does not support findByTotalCost method.");
    }

    @Override
    public List<User> findByPlacementDate(LocalDate placementDate) {
        throw new UnsupportedOperationException("User persistence service does not support findByPlacementDate method.");
    }
}
