package week1.java.oops.inheritance;

public class Cat extends Animal{

    // topic: polymorphism overriding
    @Override
    public void sound() {
        System.out.println("Cat say meow");
    }
}
