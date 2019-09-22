package abstract_factory;

public interface GameUnitFactory {

    LandUnit createLandUnit();
    NavalUnit createNavalUnit();
}
