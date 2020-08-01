package instruments;

public class Trumpet extends Instrument {

    private int numberOfValves;

    public Trumpet(double price, double retailPrice) {
        super(price, retailPrice, InstrumentType.BRASS);
        this.numberOfValves = 3;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }

    public String play() {
        return "Trumpet sounds";
    }
}
