package com.programs.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class sumOfNumbers {
    public static void main(String[] args) {
        // sum of number using java 8
        //  return last element from array using java 8

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(6);
        list.add(9);



        Integer a= list.stream().mapToInt(Integer:: intValue).sum();
        System.out.println(a);

        //Arrays.stream(arr).mapToInt(Integer:: intValue).sum();
    }
}
