package deqo.ebra.mysimplestack;

import java.util.EmptyStackException;

public class Stack implements SimpleStack {
private java.util.Stack<Item> pile;//issue 2
    public Stack() {
        pile = new java.util.Stack<>();
    }

    @Override
    public boolean isEmpty() {
        return pile.isEmpty();
    }

    @Override
    public int getSize() {
        return pile.size();
    }

    @Override
    public void push(Item item) {
        pile.push(item);
    }

    @Override
    public Item peek() throws EmptyStackException {
        return pile.peek();
    }

    @Override
    public Item pop() throws EmptyStackException {
        return pile.pop();
    }
}
