package week1.java.basics;

public class PolymorphismOverridingDemo {
    public static void main(String[] args) {

        Animal obj = new Cat();   // Parent reference, child object

        obj.sound();  // Calls Cat's method
    }
}
