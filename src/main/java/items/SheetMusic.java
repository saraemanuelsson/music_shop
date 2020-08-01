package items;

public class SheetMusic extends Item {

    private String name;

    public SheetMusic(double price, double retailPrice, String name) {
        super(price, retailPrice);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
