package shop;

import instruments.Trumpet;
import items.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MusicShopTest {

    private MusicShop shop;
    private Trumpet trumpet;
    private SheetMusic sheetMusic;

    @Before
    public void before() {
        shop = new MusicShop("Perfect Pitch");
        trumpet = new Trumpet(70.00, 58.00);
        sheetMusic = new SheetMusic(5.00, 4.00, "Jack Sparrow");
        shop.addToTill(1500.00);
        shop.addToStock(trumpet);
        shop.addToStock(sheetMusic);
    }

    @Test
    public void getName() {
        assertEquals("Perfect Pitch", shop.getName());
    }

    @Test
    public void setName() {
        shop.setName("Lonely Island Shop");
        assertEquals("Lonely Island Shop", shop.getName());
    }

    @Test
    public void getTill() {
        assertEquals(1500.00, shop.getTill(), 0.01);
    }

    @Test
    public void getNumberOfItemsInStock() {
        assertEquals(2, shop.getNumberOfItemsInStock());
    }

    @Test
    public void addToStock() {
        shop.addToStock(trumpet);
        assertEquals(3, shop.getNumberOfItemsInStock());
    }

    @Test
    public void removeFromStock() {
        shop.removeFromStock(trumpet);
        assertEquals(1, shop.getNumberOfItemsInStock());
    }

    @Test
    public void addToTill() {
        shop.addToTill(100.00);
        assertEquals(1600.00, shop.getTill(), 0.01);
    }

    @Test
    public void removeFromTill() {
        shop.removeFromTill(100.00);
        assertEquals(1400.00, shop.getTill(), 0.01);
    }

    @Test
    public void sellItem() {
        shop.sellItem(trumpet);
        assertEquals(sheetMusic, shop.getStock().get(0));
        assertEquals(1570.00, shop.getTill(), 0.01);
    }
}