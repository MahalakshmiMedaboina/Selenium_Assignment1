package week1.java.oops.abstraction;

// Main Class
public class InterfaceDemo {
    public static void main(String[] args) {

        VehicleInterface v = new BikeInterface();

        v.start();
    }
}
