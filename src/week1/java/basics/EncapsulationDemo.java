package week1.java.basics;

public class EncapsulationDemo {
    public static void main(String[] args) {

        Employee emp = new Employee();

        emp.setSalary(50000);
        System.out.println("Salary: " + emp.getSalary());
    }
}
