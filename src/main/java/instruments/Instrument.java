package instruments;

import behaviour.IPlay;
import items.Item;

public abstract class Instrument extends Item implements IPlay {

    protected InstrumentType type;

    public Instrument(double price, double retailPrice, InstrumentType type) {
        super(price, retailPrice);
        this.type = type;
    }

    public InstrumentType getType() {
        return this.type;
    }

}
