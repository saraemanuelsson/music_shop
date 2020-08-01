package items.strings;

public class GuitarString extends InstrumentString {

    public GuitarString(double retailPrice, GuitarStringMaterial material) {
        super(material.getPrice(), retailPrice, material);
    }

}
