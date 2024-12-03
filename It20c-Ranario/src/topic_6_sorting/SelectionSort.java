/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic_6_sorting;

/**
 *
 * @author Peter
 */
public class SelectionSort {
    
     public static void selectionSort(int[] numbers) {
        int length = numbers.length;
        for (int current = 0; current < length - 1; current++) {
            int smallestIndex = current;
            for (int next = current + 1; next < length; next++) {
                if (numbers[next] < numbers[smallestIndex]) {
                    smallestIndex = next;
                }
            }
            // Swap the found smallest element with the current element
            int temp = numbers[smallestIndex];
            numbers[smallestIndex] = numbers[current];
            numbers[current] = temp;
        }
    }
    
}
