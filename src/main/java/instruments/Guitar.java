package instruments;

import items.strings.GuitarString;

public class Guitar extends Instrument {

    private int numberOfStrings;
    private GuitarString guitarStrings[];

    public Guitar(double price, double retailPrice, int numberOfStrings, GuitarString guitarStrings[]) {
        super(price, retailPrice, InstrumentType.STRING);
        this.numberOfStrings = numberOfStrings;
        this.guitarStrings = new GuitarString[numberOfStrings];
    }

    public GuitarString getString(int index) {
        return this.guitarStrings[index];
    }

    public void addString(int index, GuitarString newString) {
        this.guitarStrings[index] = newString;
    }

    public void removeString(int index) {
        this.guitarStrings[index] = null;
    }

    public void replaceString(int index, GuitarString newString) {
        this.guitarStrings[index] = newString;
    }

    public String play(){
        return "Guitar sounds";
    }

}
