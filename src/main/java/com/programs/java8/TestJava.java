package com.programs.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestJava {
    public static void main(String[] args) {

        int arr[] = {6,3,77,33,12,43,65};
        String arr2[] = {"kjks","eeke","aasd"};

        // sort array element in accesing order
        List<String> list = Arrays.stream(arr2).sorted().toList();

        // filter odd numbers
        List<Integer> list2 =Arrays.stream(arr).mapToObj(i-> i).filter(i->i%2==0).collect(Collectors.toList());

        System.out.println(list);

       // int number =235;

        List<String> list3 = Arrays.asList("pritam","jkdj","sdff","cglg");
        // sort element accesing order

        List<String> l = list3.stream().sorted().collect(Collectors.toList());
        System.out.println(l);


    }
}
