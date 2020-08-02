package instruments;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DrumTest {

    private Drum drum;

    @Before
    public void before() {
        drum = new Drum(75.00, 62.00, DrumType.AFRICAN, 43);
    }

    @Test
    public void getPrice() {
        assertEquals(75.00, drum.getPrice(), 0.01);
    }

    @Test
    public void setPrice() {
        drum.setPrice(100.00);
        assertEquals(100.00, drum.getPrice(), 0.01);
    }

    @Test
    public void getRetailPrice() {
        assertEquals(62.00, drum.getRetailPrice(), 0.01);
    }

    @Test
    public void setRetailPrice() {
        drum.setRetailPrice(85.00);
        assertEquals(85.00, drum.getRetailPrice(), 0.01);
    }

    @Test
    public void calculateMarkup() {
        drum.setRetailPrice(85.00);
        assertEquals(-10.00, drum.calculateMarkup(), 0.01);
    }

    @Test
    public void play() {
        assertEquals("Drumroll", drum.play());
    }

    @Test
    public void getInstrumentType() {
        assertEquals(InstrumentType.PERCUSSION, drum.getType());
    }

    @Test
    public void getDrumType() {
        assertEquals(DrumType.AFRICAN, drum.getDrumType());
    }

    @Test
    public void setDrumType() {
        drum.setDrumType(DrumType.MARCHING);
        assertEquals(DrumType.MARCHING, drum.getDrumType());
    }

    @Test
    public void getSize() {
        assertEquals(43, drum.getSize());
    }

    @Test
    public void setSize() {
        drum.setSize(51);
        assertEquals(51, drum.getSize());
    }
}