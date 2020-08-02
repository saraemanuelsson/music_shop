package instruments;

public class Drum extends Instrument {

    private DrumType drumType;
    private int size;

    public Drum(double price, double retailPrice, DrumType drumType, int size) {
        super(price, retailPrice, InstrumentType.PERCUSSION);
        this.drumType = drumType;
        this.size = size;
    }

    public String play() {
        return "Drumroll";
    }

    public DrumType getDrumType() {
        return drumType;
    }

    public void setDrumType(DrumType drumType) {
        this.drumType = drumType;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
