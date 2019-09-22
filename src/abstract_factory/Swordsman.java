package abstract_factory;

public class Swordsman extends LandUnit {

    @Override
    public void move() {
        System.out.println("Swordsman begins to move.");
    }

    @Override
    public void attack() {
        System.out.println("Swordsman gets his sword out and attacks an enemy!");
    }

    @Override
    public void rest() {
        System.out.println("Swordsman is too tired. He gets some rest.");
    }
}
