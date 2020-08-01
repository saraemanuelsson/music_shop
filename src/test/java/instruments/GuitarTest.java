package instruments;

import items.strings.GuitarString;
import items.strings.GuitarStringMaterial;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GuitarTest {

    private Guitar guitar;
    private GuitarString string1;
    private GuitarString string2;

    @Before
    public void before() {
        string1 = new GuitarString(GuitarStringMaterial.STEELANDNICKEL, 4);
        GuitarString guitarStrings[] = {string1, string1, string1, string1, string1, string1};
        guitar = new Guitar(50.00, 30.00, 6, guitarStrings);
        string2 = new GuitarString(GuitarStringMaterial.STEELANDNICKEL, 6);
    }

    @Test
    public void getPrice() {
        assertEquals(50.00, guitar.getPrice(), 0.01);
    }

    @Test
    public void setPrice() {
        guitar.setPrice(60.00);
        assertEquals(60.00, guitar.getPrice(), 0.01);
    }

    @Test
    public void getRetailPrice() {
        assertEquals(30.00, guitar.getRetailPrice(), 0.01);
    }

    @Test
    public void setRetailPrice() {
        guitar.setRetailPrice(40.00);
        assertEquals(40.00, guitar.getRetailPrice(), 0.01);
    }

    @Test
    public void calculateMarkup() {
        assertEquals(20.00, guitar.calculateMarkup(),0.01);
    }

    @Test
    public void play() {
        assertEquals("Guitar sounds", guitar.play());
    }

    @Test
    public void canReplaceString() {
        guitar.replaceString(2, string2);
        assertEquals(string2, guitar.getString(2));
    }
}