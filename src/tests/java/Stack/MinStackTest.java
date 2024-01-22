package Stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinStackTest {

    @Test
    public void testMinStackOperations() {
        MinStack minStack = new MinStack();

        // Test push and top
        minStack.push(3);
        assertEquals(3, minStack.top());

        minStack.push(5);
        assertEquals(5, minStack.top());

        minStack.push(2);
        assertEquals(2, minStack.top());

        // Test getMin
        assertEquals(2, minStack.getMin());

        // Test pop
        minStack.pop();
        assertEquals(5, minStack.top());

        // Test getMin after pop
        assertEquals(3, minStack.getMin());

        // Test multiple pops
        minStack.pop();
        minStack.pop();

        // Test isEmpty
        assertTrue(minStack.isEmpty());

        // Test push and getMin after pops
        minStack.push(1);
        minStack.push(7);
        minStack.push(4);

        assertEquals(1, minStack.getMin());

        // Test pop and getMin after push
        minStack.pop();
        assertEquals(1, minStack.getMin());
    }
}