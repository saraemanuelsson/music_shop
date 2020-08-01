package items.strings;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuitarStringTest {

    private GuitarString guitarString;

    @Before
    public void before(){
        guitarString = new GuitarString(4.00, GuitarStringMaterial.BRASSANDBRONZE);
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
        assertEquals(4.00, guitarString.getRetailPrice(), 0.01);
    }

    @Test
    public void setRetailPrice() {
        guitarString.setRetailPrice(3.50);
        assertEquals(3.50, guitarString.getRetailPrice(), 0.01);
    }

    @Test
    public void calculateMarkup() {
        assertEquals(3.00, guitarString.calculateMarkup(), 0.01);
    }
}