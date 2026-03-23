package week1.java.basics;

public class Cat extends Animal{

    // topic: polymorphism overriding
    @Override
    public void sound() {
        System.out.println("Cat say meow");
    }
}
