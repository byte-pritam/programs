package com.programs.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AppProgram {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3,8,33,22,12);

        List<Integer> l = list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());

        System.out.println(l);

        int arr[] = {88,32,5,44,23};

       int a[] = Arrays.stream(arr).sorted()
               .toArray();

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}

class Employee{
    String name;
    int salary;

}