package items.strings;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HarpStringTest {

    private HarpString harpString;

    @Before
    public void before() {
        harpString = new HarpString(HarpStringMaterial.METAL, 15);
    }

    @Test
    public void getMaterial() {
        assertEquals(HarpStringMaterial.METAL, harpString.getMaterial());
    }

    @Test
    public void getThickness() {
        assertEquals(15, harpString.getThickness());
    }

    @Test
    public void getPrice() {
        assertEquals(15.00, harpString.getPrice(), 0.01);
    }

    @Test
    public void getRetailPrice() {
        assertEquals(13.00, harpString.getRetailPrice(), 0.01);
    }

    @Test
    public void calculateMarkup() {
        assertEquals(2.00, harpString.calculateMarkup(), 0.01);
    }
}