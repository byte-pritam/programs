package com.programs.oops;

public class InheritanceDemo {
    public static void main(String[] args) {

    }
}

class A{

    public void print(){
        System.out.println("Print from A");
    }
}

class B extends A {
    public void show(){
        System.out.println("Show from B");
    }


    public void print() {
        System.out.println("");
    }
}

class C extends A {

}


