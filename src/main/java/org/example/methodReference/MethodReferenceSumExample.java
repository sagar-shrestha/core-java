package org.example.methodReference;

public class MethodReferenceSumExample {

    public static void main(String[] args) {

        /**
         * Method Reference are special types of lambda expression
         *
         * Type 1: Static Method
         *
         * Single line lambda can be replaced with method reference
         *
         * Any method can be used as method reference???
         *
         */

        // anonymous method way
        ISum sum = new ISum() {
            @Override
            public int sum(int a, int b) {
                return a + b;
            }
        };

        int sum1 = sum.sum(1, 2);
        System.out.println("anonymous method way : " + sum1);

        // lamda method way
        ISum iSum = (value1, value2) -> value1 + value2;
        int sum2 = iSum.sum(1, 2);
        System.out.println("lamda method way : " + sum2);


        // method reference way
        ISum iSum1 = MethodReferenceSumExample::addition;
        int sum3 = iSum1.sum(1, 2);
        System.out.println("Method reference way: " + sum3);

        // Method reference with existing Classes
        ISum iSum2 = Integer::sum;
        int sum4 = iSum2.sum(1, 2);
        System.out.println("Method reference way: " + sum4);
    }

    public static int addition(int value1, int value2) {
        return value1 + value2;
    }
}
