package week1.java.basics;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>();

        // Adding elements
        names.add("Maha");
        names.add("Selenium");
        names.add("Automation");

        // Access element
        System.out.println("First element: " + names.get(0));

        // Loop through list
        for(String name : names) {
            System.out.println(name);
        }
    }
}
