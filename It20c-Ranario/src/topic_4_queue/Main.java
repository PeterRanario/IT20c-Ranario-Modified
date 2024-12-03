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
    
    public static void main(String[] args){

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
        switch(choices) {
                case 1:
                    System.out.println();
                    customerQueue.displayQueue();
                    break;

                case 2:
                    sc.nextLine();
                    System.out.println("Enter new customer: ");
                    String name = sc.nextLine();
                    System.out.println();
                    customerQueue.enqueue(new Customer(name));
                    break;

                case 3:
                    System.out.println();
                    customerQueue.dequeue();
                    break;
                case 4:
                    System.out.println();
                    System.out.println("Thank you! Enjoy!!.");
                    System.exit(0);
                    break;
                default:
                    System.out.println();
                    System.out.println("Invalid input. Please select a valid choice.......");

            }
        }
    }
}
