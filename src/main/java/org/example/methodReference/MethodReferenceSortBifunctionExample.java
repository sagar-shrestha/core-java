package org.example.methodReference;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

public class MethodReferenceSortBifunctionExample {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 12, 33, 22, 78, 45, 23, 45);

        Consumer<List<Integer>> sortingList = Collections::sort;
        sortingList.accept(list);
        System.out.println(sortingList);
    }
}
