package instruments;

import behaviour.IPlay;
import items.Item;

public abstract class Instrument extends Item implements IPlay {

    protected Enum type;

    public Instrument(double price, double retailPrice, Enum type) {
        super(price, retailPrice);
        this.type = type;
    }

}
