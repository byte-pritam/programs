package com.programs.anagrams;

import java.util.function.Function;
import java.util.stream.Collectors;

public class StremMethod {
    public static void main(String[] args) {

        String str = "earthf";
        String str2 = "heartf";

        // check length of two string
        boolean equals = str.chars().boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .equals(
                        str2.chars().boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                );
        System.out.println(equals);
    }
}
