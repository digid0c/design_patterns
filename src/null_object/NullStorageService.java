package null_object;

public class NullStorageService implements StorageService {

    @Override
    public void save(Report report) {
        System.out.println("Do nothing.");
    }
}
