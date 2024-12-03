/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic_3_stack;

/**
 *
 * @author Peter
 */
public class Stack {

    private int[] stackArray;
    private int top;

    // Constructor to initialize the stack with a specific size
    public Stack(int size) {
        stackArray = new int[size];
        top = -1;

    }

    public boolean push(int value) {
        if (top >= stackArray.length - 1) {
            return false;
        }
        stackArray[++top] = value;
        return true;
    }

    public int pop() {
        if (top < 0) {
            return -1;
        }
        return stackArray[top--];
    }
    
     public int size() {
        return top + 1;
    }
}
