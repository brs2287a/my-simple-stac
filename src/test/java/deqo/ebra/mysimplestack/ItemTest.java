package deqo.ebra.mysimplestack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {
    private Item item;

    @Before
    public void setUp() throws Exception {
        item = new Item(10);
    }

    @Test
    public void getValue() {
        int val = item.getValue();
        assertEquals(val,10);
    }

    @Test
    public void setValue() {
        item.setValue( 11);
        assertEquals(item.getValue(), 11);
    }
}