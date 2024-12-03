/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic_4_queue;

import java.util.Scanner;

/**
 *
 * @author Peter
 */
public class Main {

    Scanner sc = new Scanner(System.in);
    Queue customerQueue = new Queue();

    System.out.println ("Hello! Good Day Ma'am/Sir!");
             
        while(true) {
                               
            System.out.println("Choose what you want:"
                + " 1. Display Queue."
                + " 2. Add Customer. "
                + " 3. Serve Customer."
                + " 4. Exit");

        int choices = sc.nextInt();
    }
}
