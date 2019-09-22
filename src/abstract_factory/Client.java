package abstract_factory;

public class Client {

    private GameUnitFactory factory;

    public Client(GameUnitFactory factory) {
        this.factory = factory;
    }

    public void playGame() {
        LandUnit landUnit = factory.createLandUnit();
        NavalUnit navalUnit = factory.createNavalUnit();

        landUnit.move();
        landUnit.attack();
        landUnit.move();
        navalUnit.move();
        landUnit.rest();
        System.out.println();

        navalUnit.takeOnBoard(landUnit);
        navalUnit.takeOffBoard();
        System.out.println();
    }

    public static void main(String[] args) {
        Client client1 = new Client(new MedievalAgeGameUnitFactory());
        client1.playGame();

        Client client2 = new Client(new IndustrialAgeGameUnitFactory());
        client2.playGame();
    }
}
