package deqo.ebra.mysimplestack;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    private Stack stack;

    @Before
    public void setUp() throws Exception {
        stack = new Stack();
        stack.push(new Item(10));
    }

    @Test
    public void isEmpty() {
        assertFalse(stack.isEmpty());
    }

    @Test
    public void getSize() {
        assertEquals(stack.getSize(),1);
    }

    @Test
    public void push() {
        Item item = new Item(20);
        stack.push(item);
        assertEquals(stack.peek().getValue(),20);
    }

    @Test
    public void peek() {
        assertEquals(stack.peek().getValue(),10);
    }

    @Test
    public void pop() {
        stack.pop();
        assertTrue(stack.isEmpty());
    }
}