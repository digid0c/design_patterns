package facade.email_subsystem;

public class StationaryFactory {

    public static Stationary createStationary() {
        return new GoogleStationary();
    }
}
