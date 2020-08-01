package items.strings;

import items.Item;

public abstract class InstrumentString extends Item {

    protected Enum material;
    protected int thickness;

    public InstrumentString(double price, double retailPrice, Enum material, int thickness ) {
        super(price, retailPrice);
        this.material = material;
        this.thickness = thickness;
    }

    public Enum getMaterial() {
        return material;
    }

    public void setMaterial(Enum material) {
        this.material = material;
    }

    public int getThickness() {
        return thickness;
    }

    public void setThickness(int thickness) {
        this.thickness = thickness;
    }
}
