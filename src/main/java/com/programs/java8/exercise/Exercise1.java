package com.programs.java8.exercise;

import javax.print.attribute.standard.Compression;
import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Exercise1 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(5,3,6,8,5,1,9,8,22);
        List<String > listString = Arrays.asList("pkpd","kumar","kamrat");

       // 1. Write a Java program to calculate the average of a list of integers using streams.
        Double avg = list.stream().collect( Collectors.averagingInt(Integer::intValue));
        System.out.println(avg);

        // 2. Write a Java program to convert a list of strings to uppercase or lowercase using streams.
        List<String> upperList = listString.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
        System.out.println(upperList);

        // 3. Write a Java program to calculate the sum of all even, odd numbers in a list using streams.
        Integer evenSum = list.stream().filter(s-> s%2 ==0).collect(Collectors.summingInt(Integer::intValue));
        System.out.println(evenSum);

        // 4. Write a Java program to remove all duplicate elements from a list using streams.
        List<Integer> uniqueValue = list.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueValue);

        // 5. Write a Java program to count the number of strings in a list that start with a specific letter using streams.
        Long count = listString.stream().filter(s->s.startsWith("k")).collect(Collectors.counting());
        System.out.println(count);

        // 6. Write a Java program to sort a list of strings in alphabetical order, ascending and descending using streams.
        List<String> accesString = listString.stream().sorted().collect(Collectors.toList());
        System.out.println(accesString);

        // 7. Write a Java program to find the maximum and minimum values in a list of integers using streams.
        Optional<Integer> maxValue = list.stream().min(Comparator.comparing(Integer::intValue));
        System.out.println(maxValue.get());

        // 8. Write a Java program to find the second smallest and largest elements in a list of integers using streams.
        Optional<Integer> greatesValue = list.stream().sorted(Comparator.comparing(Integer::intValue)).skip(1).findFirst();
        System.out.println(greatesValue.get());

        // 9. Find duplicate element from list
        Set<Integer> duplicateEle = list.stream().filter(i->Collections.frequency(list,i)>1).collect(Collectors.toSet());
        System.out.println(duplicateEle);

        Set<Integer> ll = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet()
                .stream()
                .filter(i-> i.getValue() >1)
                .map(Map.Entry:: getKey)
                .collect(Collectors.toSet());

        System.out.println(ll);

        Optional<String> op = Optional.ofNullable(null);
        System.out.println(op.isEmpty());



    }
}
