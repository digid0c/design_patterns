package abstract_factory;

public class MedievalAgeGameUnitFactory implements GameUnitFactory {

    @Override
    public LandUnit createLandUnit() {
        return new Swordsman();
    }

    @Override
    public NavalUnit createNavalUnit() {
        return new Galley();
    }
}
