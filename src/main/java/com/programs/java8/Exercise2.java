package com.programs.java8;

import java.util.*;
import java.util.stream.Collectors;

public class Exercise2 {
    public static void main(String[] args) {
        System.out.println("hi");
        Inf i = new B();
        i.print();;
        i.m();

    }
}


interface Inf{
    void print();
    default void m(){
        System.out.println("m method");
    }

}
class A implements Inf{
    public void print(){
        System.out.println("print");
    }
}

class B implements Inf{
    public void print(){
        System.out.println("print B");
    }

    @Override
    public void m() {

        System.out.println("m from B");
    }
}


