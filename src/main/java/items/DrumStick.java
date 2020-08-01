package items;

public class DrumStick extends Item {

    private int length;
    private String colour;

    public DrumStick(double price, double retailPrice, int length, String colour) {
        super(price, retailPrice);
        this.length = length;
        this.colour = colour;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

}
