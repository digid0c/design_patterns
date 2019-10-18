package SOLID.interface_segregation.good_design;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class OrderPersistenceServiceImpl implements OrderPersistenceService {

    private static final Map<Long, Order> STORAGE = new ConcurrentHashMap<>();

    @Override
    public Order findById(Long id) {
        return STORAGE.get(id);
    }

    @Override
    public void save(Order entity) {
        STORAGE.put(entity.getId(), entity);
    }

    @Override
    public void delete(Long id) {
        STORAGE.remove(id);
    }

    @Override
    public List<Order> findByTotalCost(Double totalCost) {
        return STORAGE.values().stream()
                .filter(order -> order.getTotalCost() == totalCost)
                .collect(Collectors.toList());
    }

    @Override
    public List<Order> findByPlacementDate(LocalDate placementDate) {
        return STORAGE.values().stream()
                .filter(order -> order.getPlacementDate().isEqual(placementDate))
                .collect(Collectors.toList());
    }
}
