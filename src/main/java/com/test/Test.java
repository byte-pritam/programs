package com.test;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        System.out.println("mian");

//        List<Integer> list = Arrays.asList(11,5,4,14);
//
//        //int digit =0;
//
//        // 23 /10 = 2 , n=2,
//        //12 /10 = 1,
//
//        for (int i = 0; i < list.size(); i++) {

//
//            int digit = list.get(i);
//            if(digit !=1){
//                list.remove(i);
//            }
//
//        }
//
//        System.out.println(list);

        int n =12; // 1
        int sum = 0;
        while (n/10 >0){
            int digit = n/10;
            n = n%10;
            sum = sum+ digit;
        }
        System.out.println(sum);


    }
}



