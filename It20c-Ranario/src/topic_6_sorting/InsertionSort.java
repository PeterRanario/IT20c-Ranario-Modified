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
public class InsertionSort {

    public static void insertionSort(int[] data) {
        int size = data.length;
        for (int index = 1; index < size; index++) {
            int currentElement = data[index];
            int position = index - 1;
        }

        // Shift elements of data[0..index-1], that are greater than currentElement, to one position ahead
        while (position >= 0 && data[position] > currentElement) {
            data[position + 1] = data[position];
            position = position - 1;
        }
        data[position + 1] = currentElement;
    }
}

