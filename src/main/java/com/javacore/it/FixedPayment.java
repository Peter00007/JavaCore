package main.java.com.javacore.it;

//class with fixed payment by months
public class FixedPayment extends Employee {
    private int fixedsalary;

    public FixedPayment(int id, String name, int fixedsalary) {
        super (id, name);
        this.fixedsalary = fixedsalary;
    }

    //override method that calculates the average monthly salary
    @Override
    public double averageMonthlySalary() {
        return fixedsalary;
    }
}
