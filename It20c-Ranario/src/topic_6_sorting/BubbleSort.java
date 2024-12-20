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
public class BubbleSort {

    public static void bubbleSort(int[] numbers) {
        int size = numbers.length;
        for (int pass = 0; pass < size - 1; pass++) {
            for (int index = 0; index < size - pass - 1; index++) {
                if (numbers[index] > numbers[index + 1]) {
                    // Swap numbers[index] and numbers[index + 1]
                    int temp = numbers[index];
                    numbers[index] = numbers[index + 1];
                    numbers[index + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] numbers = {11, 22, 33, 12, 44, 55, 90};
        System.out.println("Original array:");
        printArray(numbers);

        bubbleSort(numbers);

        System.out.println("Sorted array:");
        printArray(numbers);
    }
}
