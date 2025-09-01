package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamApiStudentExample {

    public static void main(String[] args) {

        /*
        Intermediate Function: intermeiate function always return stream of object like map(), filter().

        Terminal operation: If a method doesnot return stream of object is called terminal operation like forEach(), collect(), count().

        NOTE: Stream is lazy in nature.

        Terminal operation trigger the stream or we can say intermediate function.

        Stateful operation need to process entire input before processing the result.

        As shown in the example below:
         */

        Student sagar = new Student(1, "sagar", 123456, 22);
        Student kundam = new Student(1, "kundan", 123456, 16);
        Student kushal = new Student(1, "kushal", 123456, 22);
        Student kopila = new Student(1, "kopila", 123456, 19);
        Student rajendra = new Student(1, "rajendra", 123456, 22);

        List<Student> students = new ArrayList<>();
        students.add(sagar);
        students.add(kundam);
        students.add(kushal);
        students.add(kopila);
        students.add(rajendra);

//        Stream<Student> studentStream = students.stream();
//
//        studentStream.forEach(student -> System.out.println(student));

        students.stream().filter(student -> student.getAge() <= 20)
                .forEach(System.out::println);

    }
}
