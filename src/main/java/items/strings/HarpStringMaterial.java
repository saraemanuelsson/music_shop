package items.strings;

public enum HarpStringMaterial {

    GUT(20.00, 16.00),
    WIRE(10.00, 8.00),
    NYLON(8.00, 7.00),
    METAL(15.00, 13.00);

    private final double price;
    private final double retailPrice;

    HarpStringMaterial(double price, double retailPrice) {
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
