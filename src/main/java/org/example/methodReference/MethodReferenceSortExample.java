package org.example.methodReference;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MethodReferenceSortExample {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(list);


        // lamda way
        Isort isort = lis -> {
            Collections.sort(list);
        };

        isort.sortAsList(list);
        System.out.println(list);


        // Method reference way using Collections class

        Isort isort1 = Collections::sort;
        isort1.sortAsList(list);
        System.out.println(list);
    }
}
