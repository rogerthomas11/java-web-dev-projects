package org.launchcode;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class Restaurant {

    public static void main(String[] args) {
        // write your code here
//        Create several items and add them to a menu.
        MenuItem item1 = new MenuItem("Samosa", 2.99, "spicy and tasty", "Breakfast", false);
        MenuItem item2 = new MenuItem("Butter Paneer", 12.99, "cheese gravy","Main Course", false);
        MenuItem item3 = new MenuItem("Biryani", 14.99, "Spicy rice with veggie", "Main Course",true);
        MenuItem item4 = new MenuItem("GulabJamun", 7.99, "Sweet", "Dessert", false);
        MenuItem item5 = new MenuItem("Rasmalai", 5.99, "Sweet", "Dessert", false);
        Date today = Calendar.getInstance().getTime();
//        Print the entire, updated menu to the screen.
        ArrayList<MenuItem> item = new ArrayList<>();
        item.add(item1);
        item.add(item2);
        item.add(item3);
        item.add(item4);
        item.add(item5);

        Menu myMenu = new Menu(today, item);
        System.out.println(item);
//        Print an individual menu item to the screen.
        System.out.println(item1);
//        Delete an item from a menu, then reprint the menu.
    }
}
