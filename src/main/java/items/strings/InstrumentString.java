package items.strings;

import items.Item;

public abstract class InstrumentString extends Item {

    protected Enum material;

    public InstrumentString(double price, double retailPrice, Enum material) {
        super(price, retailPrice);
        this.material = material;
    }

    public Enum getMaterial() {
        return material;
    }

    public void setMaterial(Enum material) {
        this.material = material;
    }
}
