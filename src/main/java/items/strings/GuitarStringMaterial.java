package items.strings;

public enum GuitarStringMaterial {

    STEELANDNICKEL(5.00),
    BRASSANDBRONZE(7.00),
    NYLON(3.00);

    private final double price;

    GuitarStringMaterial(double price) {
        this.price = price;
    }

    public double getPrice() {
        return this.price;
    }

}
