package org.example.test;

public class X {

    public static void main(String[] args) {

        SagarMarkerInterface sagarMarkerInterfaceForA = new A();
        SagarMarkerInterface sagarMarkerInterfaceForB = new B();
        SagarMarkerInterface sagarMarkerInterfaceForC = new C();

        String hello = sagarMarkerInterfaceForA.getClass().getName();
    }
}
