/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DisplayViaForLoop;

/**
 *
 * @author ITLAB2-PC13-STUDENT
 */
public class DisplayViaForLoop {
    
     public static void main(String[] args) {

        String[] fruits = {"Apple", "Melon", "Papaya", "Banana"};

        System.out.println("Fruits in array: ");

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
    }
}
