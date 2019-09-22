package abstract_factory;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Ironclad extends NavalUnit {

    @Override
    public void move() {
        System.out.println("Ironclad is too heavy to start moving.");
    }

    @Override
    public void takeOnBoard(LandUnit ... units) {
        this.units = Arrays.stream(units)
                .peek(unit -> System.out.println(String.format("Taking a %s on board.", unit.getClass().getSimpleName())))
                .peek(unit -> System.out.println("Unit is on board!"))
                .collect(Collectors.toList());
    }

    @Override
    public void takeOffBoard() {
        this.units.forEach(unit -> System.out.println(String.format("Taking a %s off board. Good luck!", unit.getClass().getSimpleName())));
        this.units.clear();
    }
}
