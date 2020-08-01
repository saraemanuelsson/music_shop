package items.strings;

public class ViolinString extends InstrumentString {

    public ViolinString(ViolinStringMaterial material, int thickness) {
        super(material.getPrice(), material.getRetailPrice(), material, thickness);
    }

}
