package prototype;

import javafx.geometry.Point3D;

import java.util.concurrent.TimeUnit;

public class Client {

    public static void main(String[] args) throws InterruptedException {
        Swordsman swordsman = new Swordsman();
        swordsman.move(new Point3D(10, 20, 30), 75);
        swordsman.attack();
        System.out.println(swordsman);
        createCloneFromPrototype(swordsman);

        TimeUnit.MILLISECONDS.sleep(500);

        General general = new General();
        general.move(new Point3D(30, 20, 10), 75);
        general.boostMorale();
        System.out.println(general);
        createCloneFromPrototype(general);
    }

    private static void createCloneFromPrototype(GameUnit prototype) throws InterruptedException {
        try {
            TimeUnit.MILLISECONDS.sleep(500);
            System.out.println(prototype.clone());
        } catch (CloneNotSupportedException | UnsupportedOperationException e) {
            System.err.println(e.getMessage());
        }
    }
}
