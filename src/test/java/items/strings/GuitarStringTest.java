package items.strings;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuitarStringTest {

    private GuitarString guitarString;

    @Before
    public void before(){
        guitarString = new GuitarString(GuitarStringMaterial.BRASSANDBRONZE, 9);
    }

    @Test
    public void getMaterial() {
        assertEquals(GuitarStringMaterial.BRASSANDBRONZE, guitarString.getMaterial());
    }

    @Test
    public void setMaterial() {
        guitarString.setMaterial(GuitarStringMaterial.NYLON);
        assertEquals(GuitarStringMaterial.NYLON, guitarString.getMaterial());
    }

    @Test
    public void getPrice() {
        assertEquals(7.00, guitarString.getPrice(), 0.01);
    }

    @Test
    public void setPrice() {
        guitarString.setPrice(6.00);
        assertEquals(6.00, guitarString.getPrice(), 0.01);
    }

    @Test
    public void getRetailPrice() {
        assertEquals(5.00, guitarString.getRetailPrice(), 0.01);
    }

    @Test
    public void setRetailPrice() {
        guitarString.setRetailPrice(3.50);
        assertEquals(3.50, guitarString.getRetailPrice(), 0.01);
    }

    @Test
    public void calculateMarkup() {
        assertEquals(2.00, guitarString.calculateMarkup(), 0.01);
    }

    @Test
    public void getThickness() {
        assertEquals(9, guitarString.getThickness());
    }

    @Test
    public void setThickness() {
        guitarString.setThickness(12);
        assertEquals(12, guitarString.getThickness());
    }
}