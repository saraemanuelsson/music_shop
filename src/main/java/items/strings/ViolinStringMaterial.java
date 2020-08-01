package items.strings;

public enum ViolinStringMaterial {

    GUT(20.00, 15.00),
    STEEL(17.00, 14.00),
    SYNTHETIC(10.00, 7.00);

    private final double price;
    private final double retailPrice;

    ViolinStringMaterial(double price, double retailPrice) {
        this.price = price;
        this.retailPrice = retailPrice;
    }

    public double getPrice(){
        return this.price;
    }

    public double getRetailPrice() {
        return this.retailPrice;
    }

}
