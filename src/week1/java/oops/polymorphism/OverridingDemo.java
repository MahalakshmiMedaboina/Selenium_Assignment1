package week1.java.oops.polymorphism;

import week1.java.oops.inheritance.Animal;
import week1.java.oops.inheritance.Cat;

public class OverridingDemo {
    public static void main(String[] args) {

        Animal obj = new Cat();   // Parent reference, child object

        obj.sound();  // Calls Cat's method
    }
}
