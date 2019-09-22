package abstract_factory;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Galley extends NavalUnit {

    @Override
    public void move() {
        System.out.println("An ancient galley is trying to move a little bit further...");
    }

    @Override
    public void takeOnBoard(LandUnit ... units) {
        this.units = Arrays.stream(units)
                .peek(unit -> System.out.println(String.format("Taking a %s on board.", unit.getClass().getSimpleName())))
                .collect(Collectors.toList());
    }

    @Override
    public void takeOffBoard() {
        this.units.forEach(unit -> System.out.println(String.format("Taking a %s off board.", unit.getClass().getSimpleName())));
        this.units.clear();
    }
}
