package items.strings;

public class HarpString extends InstrumentString {

    public HarpString(HarpStringMaterial material, int thickness) {
        super(material.getPrice(), material.getRetailPrice(), material, thickness);
    }

}
