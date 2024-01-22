package Stack;

//Todo: Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
// Implement the MinStack class:
//    MinStack() initializes the stack object.
//    void push(int val) pushes the element val onto the stack.
//    void pop() removes the element on the top of the stack.
//    int top() gets the top element of the stack.
//    int getMin() retrieves the minimum element in the stack.
// You must implement a solution with O(1) time complexity for each function.

import java.util.ArrayList;
import java.util.List;

public class MinStack {

    // keep the minimum at each level
    private int currentElement = -1;
    private int size = 0;
    private List<Integer> list = new ArrayList<>();
    private List<Integer> currentMinimum = new ArrayList<>();

    public MinStack() {

    }

    public void push(int val) {
        currentElement++;
        list.add(currentElement, val);
        if (size == 0) currentMinimum.addFirst(val);
        else {
            Integer lastCurrentMin = currentMinimum.get(currentElement - 1);
            if (val <= lastCurrentMin) {
                currentMinimum.add(currentElement, val);
            } else {
                currentMinimum.add(currentElement, lastCurrentMin);
            }
        }
        size++;
    }

    public void pop() {
        list.remove(currentElement);
        currentMinimum.remove(currentElement);
        size--;
        if (size == 0) currentElement = -1; else currentElement--;
    }

    public int top() {
        return list.get(currentElement);
    }

    public int getMin() {
        return currentMinimum.get(currentElement);
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
