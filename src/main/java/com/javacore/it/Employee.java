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

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //an abstract method that override in other classes
    abstract public double averageMonthlySalary();
}
