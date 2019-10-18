package SOLID.interface_segregation.bad_design;

import java.time.LocalDate;
import java.util.List;

/**
 * This is an example of interface segregation design principle violation. Persistence service interface declares methods
 * that are associated with only part of it's derivatives. According to above mentioned principle, any interface must declare
 * only those methods that are associated with all of it's derivatives.
 * @param <T>
 */
public interface PersistenceService<T extends Entity> {

    T findById(Long id);

    void save(T entity);

    void delete(Long id);

    List<T> findByName(String name);

    List<T> findByAge(Integer age);

    List<T> findByTotalCost(Double totalCost);

    List<T> findByPlacementDate(LocalDate placementDate);
}
