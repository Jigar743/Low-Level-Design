package LLD1.LambdaAndStreamApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
//        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 6);
//
//        Stream<Integer> evenNums = numbers.filter(number -> number % 2 == 0);

        // (key, value) -> System.out.println(key + ", " + value)
//        evenNums.toArray().toString();
//        System.out.println(evenNums);

//        MathOperations addition = (a, b) -> {
//            return (double) (b + a);
//        };
//
//        MathOperations subtractions = (a, b) -> {
//            return (double) (b- a);
//        };
//
//        MathOperations multiplications = (a, b) -> {
//            return (double) (b * a);
//        };
//
//        MathOperations division = (a, b) -> {
//            if(b == 0) return 0.0;
//
//            return (double) a / b;
//        };
//
//        System.out.println(addition.operation(1, 2));
//        System.out.println(subtractions.operation(1, 2));
//        System.out.println(multiplications.operation(1, 2));
//        System.out.println(division.operation(1, 2));


//        Stream<String> stream = Stream.of("apple", "banana", "cherry");

//        boolean is = stream.allMatch(s -> s.startsWith("a"));

//        System.out.println(is);
//        stream.forEach(System.out::print);
//        stream.filter(s -> s.startsWith("a")).forEach(System.out::println);

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        System.out.println(numbers.stream().reduce(0, (acc, curr) -> curr + acc));

        // square of above list
        numbers.stream().map(val -> val * val).forEach(val -> System.out.print(val+ " "));
        System.out.println();
        // filtering out even numbers from list
        numbers.stream().filter(val -> val % 2 == 0).forEach(val -> System.out.print(val+ " "));

        System.out.println();
        // Length of each name.
        List<String> names = List.of("Tantia Tope", "Rani Lakshmibai", "Mangal Pandey", "Nana Sahib");
        names.stream().map(String::length).forEach(val -> System.out.print(val+ " "));
    }
}
