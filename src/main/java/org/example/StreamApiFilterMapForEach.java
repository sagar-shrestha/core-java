package org.example;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StreamApiFilterMapForEach {

    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        Arrays.stream(integers).filter(integer -> integer >2 )
                .map(integer -> {
                   switch (integer) {
                       case 1: return "one";
                       case 2: return "two";
                       case 3: return "three";
                       case 4: return "four";
                       case 5: return "five";
                       case 6: return "six";
                       case 7: return "seven";
                       case 8: return "eight";
                       case 9: return "nine";
                       case 10: return "ten";
                   }
                    return "number out of range";
                })
                .forEach(System.out::println);
    }
}
