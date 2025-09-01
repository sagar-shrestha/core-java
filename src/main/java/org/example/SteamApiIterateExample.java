package org.example;

import java.util.Enumeration;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class SteamApiIterateExample {

    public static void main(String[] args) {

        /*
        Unary Operator: It is a special functional interface or function that takes and returns same datatype.
        Below is the example.
         */
        Stream.iterate(0, new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer) {
                return integer + 1;
            }
        })
                /*
                Once limit has been reached, limit() is terminated the pipeline and stopping more data to  flow
                even in case we have more data available in the pipeline.
                 */
                // Limit is short-circuiting stateful element/method
                .limit(10)
                .peek(num -> System.out.println("limited no: " + num))
                .sorted()
                .peek(num -> System.out.println("sorted no: " + num))
                .forEach(System.out::println);
    }
}
