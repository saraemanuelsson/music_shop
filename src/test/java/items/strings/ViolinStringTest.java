package items.strings;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ViolinStringTest {

    private ViolinString violinString;

    @Before
    public void before() {
        violinString = new ViolinString(ViolinStringMaterial.GUT, 4);
    }

    @Test
    public void getMaterial() {
        assertEquals(ViolinStringMaterial.GUT, violinString.getMaterial());
    }

    @Test
    public void setMaterial() {
        violinString.setMaterial(ViolinStringMaterial.STEEL);
        assertEquals(ViolinStringMaterial.STEEL, violinString.getMaterial());
    }

    @Test
    public void getThickness() {
        assertEquals(4, violinString.getThickness());
    }

    @Test
    public void setThickness() {
        violinString.setThickness(6);
        assertEquals(6, violinString.getThickness());
    }

    @Test
    public void getPrice() {
        assertEquals(20.00, violinString.getPrice(), 0.01);
    }

    @Test
    public void setPrice() {
        violinString.setPrice(25.00);
        assertEquals(25.00, violinString.getPrice(), 0.01);
    }

    @Test
    public void getRetailPrice() {
        assertEquals(15.00, violinString.getRetailPrice(), 0.01);
    }

    @Test
    public void setRetailPrice() {
        violinString.setPrice(17.00);
        assertEquals(17.00, violinString.getPrice(), 0.01);
    }

    @Test
    public void calculateMarkup() {
        assertEquals(5.00, violinString.calculateMarkup(), 0.01);
    }
}