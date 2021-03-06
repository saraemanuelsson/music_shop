package items.strings;

public enum GuitarStringMaterial {

    STEELANDNICKEL(5.00, 4.00),
    BRASSANDBRONZE(7.00, 5.00),
    NYLON(3.00, 2.80);

    private final double price;
    private final double retailPrice;

    GuitarStringMaterial(double price, double retailPrice) {
        this.price = price;
        this.retailPrice = retailPrice;
    }

    public double getPrice() {
        return this.price;
    }

    public double getRetailPrice() {
        return this.retailPrice;
    }

}
