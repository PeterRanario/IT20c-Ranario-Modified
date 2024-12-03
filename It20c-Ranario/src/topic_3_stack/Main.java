/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic_3_stack;

import java.util.Scanner;

/**
 *
 * @author Peter
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Stack stack = new Stack(5);

        System.out.println("Good day! Hello.");

        while (true) {
            System.out.println("Please choose what you want to do: "
                    + " 1. Size"
                    + " 2. Push"
                    + " 3. Pop"
                    + " 4. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Size of stack is: " + stack.size());
                    System.out.println("---------------");
                    break;
                case 2:
                    System.out.println("Add a number: ");
                    int num = sc.nextInt();
                    System.out.println("Value has been pushed: " + num);
                    stack.push(num);
                    stack.size();
                    System.out.println("--------------");
                    break;
                case 3:
                    stack.pop();
                    System.out.println("Element popped: " + stack.pop());
                    stack.size();
                    break;
                case 4:
                    System.out.println("Thank you for using this. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input!, Please choose a valid choice.");
            }
        }
    }
}
