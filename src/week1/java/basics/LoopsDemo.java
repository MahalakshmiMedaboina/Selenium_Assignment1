package week1.java.basics;

public class LoopsDemo {
    public static void main(String[] args) {

        // WHILE loop
        int k = 1;
        while(k <= 3) {
            System.out.println("While Loop: " + k);
            k++;
        }

        // DO-WHILE loop
        int j = 1;
        do {
            System.out.println("Do-While Loop: " + j);
            j++;
        } while(j <= 3);

        // FOR loop
        for(int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }
    }
}
