package main.java.com.javacore.it;

//parent class
abstract public class Employee {
    private int id;
    private String name;

    //constructor
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //getters and setters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    //an abstract method that override in other classes
    abstract public double averageMonthlySalary();
}
