/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        ItemManager manager = new ItemManager();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("//ArrayList Manager");
            System.out.println("1. Add item");
            System.out.println("2. Display item");
            System.out.println("3. Remove item");
            System.out.println("4. Exit");
            System.out.print("Choose your choice: ");
            
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter the item that you want to add: ");
                    String item = scanner.nextLine();
                    manager.addItem(item);
                    break;
                case 2:
                    System.out.print("Enter item that you want to remove: ");
                    String removeItem = scanner.nextLine();
                    manager.removeItem(removeItem);
                    break;
                case 3:
                    manager.displayItems();
                    break;
                case 4:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid input, try again.");
            }
        } while (choice != 4);
        scanner.close();
    }
    
}
