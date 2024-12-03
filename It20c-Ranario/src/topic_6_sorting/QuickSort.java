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
public class QuickSort {

    public static void quickSort(int[] numbers, int start, int end) {
        if (start < end) {
            int pivotIndex = partition(numbers, start, end);

            // Recursively sort elements before and after partition
            quickSort(numbers, start, pivotIndex - 1);
            quickSort(numbers, pivotIndex + 1, end);
        }
    }
    
     private static int partition(int[] numbers, int start, int end) {
        int pivotValue = numbers[end];
        int smallerIndex = start - 1;

        for (int currentIndex = start; currentIndex < end; currentIndex++) {
            if (numbers[currentIndex] <= pivotValue) {
                smallerIndex++;
                // Swap numbers[smallerIndex] and numbers[currentIndex]
                int temp = numbers[smallerIndex];
                numbers[smallerIndex] = numbers[currentIndex];
                numbers[currentIndex] = temp;
            }
        }
    }

}
