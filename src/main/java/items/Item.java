package items;

import behaviour.ISell;

public abstract class Item implements ISell {

    protected double price;
    protected double retailPrice;

    public Item(double price, double retailPrice) {
        this.price = price;
        this.retailPrice = retailPrice;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(double retailPrice) {
        this.retailPrice = retailPrice;
    }

    public double sell(){
        return this.price;
    }

    public double calculateMarkup(){
        return this.price - this.retailPrice;
    }

}
