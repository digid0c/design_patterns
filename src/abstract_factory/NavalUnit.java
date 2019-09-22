package abstract_factory;

import java.util.ArrayList;
import java.util.List;

public abstract class NavalUnit {

    protected List<LandUnit> units = new ArrayList<>();

    public abstract void move();
    public abstract void takeOnBoard(LandUnit ... units);
    public abstract void takeOffBoard();
}
