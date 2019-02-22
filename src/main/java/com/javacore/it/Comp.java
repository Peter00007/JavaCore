package main.java.com.javacore.it;

import java.util.Comparator;

/*a class that implements a comparator to sort the data in the collection
by the average salary, and if the salary equality is sorted by name*/
class Comp implements Comparator<Employee> {
    @Override
    public int compare(Employee param1, Employee param2) {
        if (param1.averageMonthlySalary() > param2.averageMonthlySalary())
            return -1;
        else if (param1.averageMonthlySalary() < param2.averageMonthlySalary())
            return 1;
        else if (param1.averageMonthlySalary() == param2.averageMonthlySalary()) {
            if (param1.getName().compareTo(param2.getName()) > 0)
                return 1;
            else if (param1.getName().compareTo(param2.getName()) < 0)
                return -1;
            else
                return 0;
        }
        return 0;
    }
}