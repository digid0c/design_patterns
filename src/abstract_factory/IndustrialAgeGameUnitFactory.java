package abstract_factory;

public class IndustrialAgeGameUnitFactory implements GameUnitFactory {

    @Override
    public LandUnit createLandUnit() {
        return new Rifleman();
    }

    @Override
    public NavalUnit createNavalUnit() {
        return new Ironclad();
    }
}
