package SOLID.interface_segregation.good_design;

import java.time.LocalDate;
import java.util.List;

/**
 * OrderPersistenceService declares methods associated with Order entity only. That way there is no need to implement
 * unrelated methods by throwing an exception.
 */
public interface OrderPersistenceService extends PersistenceService<Order> {

    List<Order> findByTotalCost(Double totalCost);

    List<Order> findByPlacementDate(LocalDate placementDate);
}
