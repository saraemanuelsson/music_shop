package items.strings;

public class GuitarString extends InstrumentString {

    public GuitarString(GuitarStringMaterial material, int thickness) {
        super(material.getPrice(), material.getRetailPrice(), material, thickness);
    }

}
