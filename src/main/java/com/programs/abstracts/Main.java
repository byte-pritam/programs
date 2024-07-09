package com.programs.abstracts;

public class Main {
    public static void main(String[] args) {
        Demo d = new A();
        d.print();
        System.out.println(d.a);
    }
}

 abstract class Demo {
    int a=10;
    public void print(){
        System.out.println("abstract value of a :"+ a);
    }
}

class A extends Demo{
    int a =20;

    @Override
    public void print() {
        System.out.println("A value of a :"+ a);
    }
}


