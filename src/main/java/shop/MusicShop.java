package shop;

import behaviour.ISell;

import java.util.ArrayList;

public class MusicShop {

    private String name;
    private double till;
    private ArrayList<ISell> stock;

    public MusicShop(String name) {
        this.name = name;
        this.till = 0.00;
        this.stock = new ArrayList<ISell>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTill() {
        return till;
    }

    public void setTill(double till) {
        this.till = till;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void setStock(ArrayList<ISell> stock) {
        this.stock = stock;
    }

    public void addToStock(ISell item) {
        this.stock.add(item);
    }

    public void removeFromStock(ISell item) {
        int index = this.stock.indexOf(item);
        this.stock.remove(index);
    }

    public void addToTill(double amount) {
        this.till += amount;
    }

    public void removeFromTill(double amount) {
        if (this.till >= amount) {
            this.till -= amount;
        }
    }

    public void sellItem(ISell item) {
        removeFromStock(item);
        addToTill(item.sell());
    }

    public int getNumberOfItemsInStock() {
        return this.stock.size();
    }


}
