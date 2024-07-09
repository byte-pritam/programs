package com.programs.java8;

import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8Test {
    public static void main(String[] args) {
        String arr[] = {"pritam","kumar","rakesh","pritam","rakesh"};
        List<String> list= Arrays.asList(arr);

       Map<String, Long> map = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(map);

        String str = "my name is pritam kumar pritam";
        Map<String, Long> m = Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(m);

       Map<Character, Long> mm = str.chars().mapToObj(i->(char)i).filter(i-> i != 32).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(mm);

        System.out.println("----------------");
        // count repeated words from array

        String wordArr[] = {"Pritam","rakesh","tom","pritam","tom"};

        Map<String,Long> countMap = Arrays.stream(wordArr).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(countMap);

        // count repeated word from string

        String st = "my name is tom and tom is good boy";

        Map<String, Long> mapData = Arrays.stream(st.split(" ")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(mapData);


        // count repeated character from string

        Map<Character,Long> charMap = st.chars().mapToObj(i-> (char)i).filter(s-> s!=32).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(charMap);

        List<Integer> mmm = Arrays.stream(wordArr).map(s->s.length()).collect(Collectors.toList());
        System.out.println(mmm);

        // Remove duplicates from array element
        int duplicatArr[] = {3,6,7,3,9,0,4,5,3,5};
        ArrayList<Integer> numbersList = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 3, 4, 5, 6, 6, 6, 7, 8));

      List<Integer> l =  numbersList.stream().distinct().collect(Collectors.toList());
        System.out.println(l);

        List<String> list2 = Arrays.asList("pritam","kumar","pritam");
        List<String> list3 = list2.stream().map(s-> s.toUpperCase()).distinct().collect(Collectors.toList());
        System.out.println(list3);


    }
}

