package com.programs.exception;

import java.io.IOException;

public class OverridingException {
    public static void main(String[] args) throws IOException {
        Parent p = new Child();
        p.print();
    }
}

class Parent{
    public void print() throws IOException{
        System.out.println("parent");
    }
}

class Child extends Parent{
    @Override
    public void print() throws ArithmeticException {
        System.out.println("child");
    }
}
