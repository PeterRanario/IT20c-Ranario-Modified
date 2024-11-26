/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultidimensionalArray;

/**
 *
 * @author ITLAB2-PC13-STUDENT
 */
public class MultidimensionalArray {
    
     public static void main(String[] args) {
        //implementaion of Multidimensional array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        //Presenting the Elements
        System.out.println("Matrix:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
                System.out.println();

            }
        }
    }
    
}
