package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrumpetTest {

    private Trumpet trumpet;

    @Before
    public void before() {
        trumpet = new Trumpet(40.00,32.00);
    }

    @Test
    public void getPrice() {
        assertEquals(40.00, trumpet.getPrice(), 0.01);
    }

    @Test
    public void setPrice() {
        trumpet.setPrice(35.00);
        assertEquals(35.00, trumpet.getPrice(), 0.01);
    }

    @Test
    public void getRetailPrice() {
        assertEquals(32.00, trumpet.getRetailPrice(), 0.01);
    }

    @Test
    public void setRetailPrice() {
        trumpet.setRetailPrice(43.00);
        assertEquals(43.00, trumpet.getRetailPrice(), 0.01);
    }

    @Test
    public void calculateMarkup() {
        assertEquals(8.00, trumpet.calculateMarkup(), 0.01);
    }

    @Test
    public void play() {
        assertEquals("Trumpet sounds", trumpet.play());
    }

    @Test
    public void numberOfVales() {
        assertEquals(3, trumpet.getNumberOfValves());
    }

}