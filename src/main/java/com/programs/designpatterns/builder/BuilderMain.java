package com.programs.designpatterns.builder;

public class BuilderMain {
    public static void main(String[] args) {

        Person p = Person.getBuilder()
                .setFirstName("Pritam")
                .setAge(4)
                .build();

        System.out.println(p);
    }
}
