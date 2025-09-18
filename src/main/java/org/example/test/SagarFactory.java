package org.example.test;

public class SagarFactory {

    public static SagarMarkerInterface getSalary(String str) {

        if (str.equalsIgnoreCase("A")) {
            return new A();
        } else if (str.equalsIgnoreCase("B")) {
            return new B();
        } else if (str.equalsIgnoreCase("C")) {
            return new C();
        } else if (str.equalsIgnoreCase("D")) {
            return new D();
        } else {
            return null;
        }
    }
}
