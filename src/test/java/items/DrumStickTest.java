package items;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DrumStickTest {

    private DrumStick drumStick;

    @Before
    public void before() {
        drumStick = new DrumStick(10.00, 6.00, 33, "Blue");
    }

    @Test
    public void getPrice() {
        assertEquals(10.00, drumStick.getPrice(), 0.01);
    }

    @Test
    public void setPrice() {
        drumStick.setPrice(11.00);
        assertEquals(11.00, drumStick.getPrice(), 0.01);
    }

    @Test
    public void getRetailPrice() {
        assertEquals(6.00, drumStick.getRetailPrice(), 0.01);
    }

    @Test
    public void setRetailPrice() {
        drumStick.setRetailPrice(8.00);
        assertEquals(8.00, drumStick.getRetailPrice(), 0.01);
    }

    @Test
    public void calculateMarkup() {
        assertEquals(4.00, drumStick.calculateMarkup(), 0.01);
    }

    @Test
    public void getLength() {
        assertEquals(33, drumStick.getLength());
    }

    @Test
    public void setLength() {
        drumStick.setLength(35);
        assertEquals(35, drumStick.getLength());
    }

    @Test
    public void getColour() {
        assertEquals("Blue", drumStick.getColour());
    }

    @Test
    public void setColour() {
        drumStick.setColour("Yellow");
        assertEquals("Yellow", drumStick.getColour());
    }
}