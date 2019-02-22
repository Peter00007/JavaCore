package main.java.com.javacore.it;

// class with hourly payment by months
public class HourPayment extends Employee {
    private int hoursalary;

    public HourPayment(int id, String name, int hoursalary) {
        super(id, name);
        this.hoursalary = hoursalary;
    }

    public int getHoursalary() {
        return hoursalary;
    }

    public void setHoursalary(int hoursalary) {
        this.hoursalary = hoursalary;
    }

    //a method that calculates the average monthly salary
    @Override
    public double averageMonthlySalary() {
        double averagesalary = 20.8 * 8 * hoursalary;
        return averagesalary;
    }
}
