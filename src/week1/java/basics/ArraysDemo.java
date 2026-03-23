package week1.java.basics;

public class ArraysDemo {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println("First element: " + numbers[0]);
        System.out.println("Second element: " + numbers[1]);

        // Loop through array
        for(int i = 0; i < numbers.length; i++) {
            System.out.println("Value: " + numbers[i]);
        }
    }
}
