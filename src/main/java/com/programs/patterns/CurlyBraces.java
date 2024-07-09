package com.programs.patterns;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class CurlyBraces {

    public static boolean isPatternValid(String pattern){
        Stack<Character> stack = new Stack<>();

        for(char ch: pattern.toCharArray()){
            if(ch == '{'){
                stack.push(ch);
            }else if(ch == '}'){
                if(stack.isEmpty() || stack.pop() != '{'){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }


    public static void main(String[] args) {
        List<String> list = Arrays.asList("{{}}", "{}{}", "{{}{}}}", "{{{}{}}}", "}}{}{}}{{{","{}}}}{{{");

        System.out.println("Correct patterns:");
        for(String pattern : list){
            if(isPatternValid(pattern)){
                System.out.println(pattern);
            }
        }

    }
}


