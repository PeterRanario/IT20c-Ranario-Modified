/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.util.ArrayList;

public class ItemManager {
    
    private ArrayList<String> items;
    public ItemManager() {
        items = new ArrayList<>();
    }
    public void addItem(String item) {
        items.add(item);
        System.out.println(item + " is added.");
    }
    public void removeItem(String item) {
        if (items.remove(item)) {
            System.out.println(item + " is removed.");
        } else {
            System.out.println(item + " not found.");
        }
    }
    
    public void displayItems() {
        if (items.isEmpty()) {
            System.out.println("List is empty.");
        } else {
            System.out.println("Items in the list:");
            for (String item : items) {
                System.out.println(" " + item);
            }
        }
    }
}

