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
public class MergeSort {

    public static void mergeSort(int[] array) {
        if (array.length < 2) {
            return;
        }
        int middle = array.length / 2;
        int[] leftHalf = new int[middle];
        int[] rightHalf = new int[array.length - middle];

        System.arraycopy(array, 0, leftHalf, 0, middle);
        System.arraycopy(array, middle, rightHalf, 0, array.length - middle);

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(array, leftHalf, rightHalf);
    }

}
