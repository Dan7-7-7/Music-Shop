import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    private Shop shop;
    private Piano piano;

    @Before
    public void before(){
        shop = new Shop();
        piano = new Piano(300, 600, 3, "Upright");
    }

    @Test
    public void canAddItemToStock(){
        shop.addItem(piano);
        assertEquals(1, shop.getStockCount());
    }
}
