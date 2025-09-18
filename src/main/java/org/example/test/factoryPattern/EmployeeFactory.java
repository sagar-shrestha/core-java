package org.example.test.factoryPattern;

public class EmployeeFactory {

    public static Employee getSalary(String str) {
        if (str.equalsIgnoreCase("Android")) {
            return new Android();
        } else if (str.equalsIgnoreCase("Web")) {
            return new Web();
        } else {
            return null;
        }
    }
}
