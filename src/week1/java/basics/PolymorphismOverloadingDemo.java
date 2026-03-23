package week1.java.basics;

public class PolymorphismOverloadingDemo {
    // Method with 2 parameters
    public void add(int a, int b) {
        System.out.println("Sum of 2 numbers: " + (a + b));
    }

    // Method with 3 parameters
    public void add(int a, int b, int c) {
        System.out.println("Sum of 3 numbers: " + (a + b + c));
    }

    public static void main(String[] args) {

        PolymorphismOverloadingDemo obj = new PolymorphismOverloadingDemo();

        obj.add(10, 20);
        obj.add(10, 20, 30);
    }
}
