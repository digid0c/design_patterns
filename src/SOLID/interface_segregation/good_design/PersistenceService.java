package SOLID.interface_segregation.good_design;

/**
 * Now PersistenceService interface declares only methods associated with all of it's derivatives.
 * @param <T>
 */
public interface PersistenceService<T extends Entity> {

    T findById(Long id);

    void save(T entity);

    void delete(Long id);
}
