package items;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SheetMusicTest {

    private SheetMusic sheetMusic;

    @Before
    public void before() {
        sheetMusic = new SheetMusic(1.00, 0.30, "YOLO");
    }

    @Test
    public void getPrice() {
        assertEquals(1.00, sheetMusic.getPrice(), 0.01);
    }

    @Test
    public void setPrice() {
        sheetMusic.setPrice(2.00);
        assertEquals(2.00, sheetMusic.getPrice(), 0.01);
    }

    @Test
    public void getRetailPrice() {
        assertEquals(0.30, sheetMusic.getRetailPrice(), 0.01);
    }

    @Test
    public void setRetailPrice() {
        sheetMusic.setPrice(0.40);
        assertEquals(0.40, sheetMusic.getPrice(), 0.01);
    }

    @Test
    public void sell() {
        assertEquals(1.00, sheetMusic.getPrice(), 0.01);
    }

    @Test
    public void calculateMarkup() {
        assertEquals(0.70, sheetMusic.calculateMarkup(), 0.01);
    }

    @Test
    public void getName() {
        assertEquals("YOLO", sheetMusic.getName());
    }

    @Test
    public void setName() {
        sheetMusic.setName("I'm on a boat");
        assertEquals("I'm on a boat", sheetMusic.getName());
    }
}