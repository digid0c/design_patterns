package abstract_factory;

public class Rifleman extends LandUnit {

    @Override
    public void move() {
        System.out.println("Rifleman is too lazy to do that. He refuses to move.");
    }

    @Override
    public void attack() {
        System.out.println("Rifleman aims to enemy, shoots and misses.");
    }

    @Override
    public void rest() {
        System.out.println("Here is your food, rifleman! Don't thank me.");
    }
}
