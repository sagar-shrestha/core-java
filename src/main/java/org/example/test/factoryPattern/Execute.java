package org.example.test.factoryPattern;

public class Execute {

    public static void main(String[] args) {

        Employee employee = EmployeeFactory.getSalary("Android");
        assert employee != null;
        int salary = employee.getSalary();
        System.out.println("Salary is: " + salary);
    }
}
