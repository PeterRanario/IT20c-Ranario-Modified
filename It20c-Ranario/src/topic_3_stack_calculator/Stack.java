/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic_3_stack_calculator;

/**
 *
 * @author Peter
 */
public class Stack {

    private int maxSize;
    private int[] stackArray;
    private int top;
    
     public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1; 
    }

}
