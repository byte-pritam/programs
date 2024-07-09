package com.programs.oops;

import java.util.HashMap;
import java.util.Map;

public class Immutable {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("1", "First");
        map.put("2", "Second");

        Student student = new Student("Pritam",123, map);

        System.out.println(student);

        map.put("3", "Third");
        System.out.println(student.getMetaData());
    }

}

final class Student{
    private String name;
    private int regNo;
    private Map<String,String> metaData;


    public Student(String name, int regNo, Map<String , String> metaData){
        this.name= name;
        this.regNo = regNo;

        Map<String, String> tempMap = new HashMap<>();

        for(Map.Entry<String, String> entry: metaData.entrySet()){
            tempMap.put(entry.getKey(), entry.getValue());
        }
        this.metaData = tempMap;

    }

    public String getName(){
        return name;
    }

    public int getRegNo(){
        return regNo;
    }

    public Map<String, String> getMetaData(){
        Map<String, String > tempMap = new HashMap<>();

        for(Map.Entry<String, String> entry : this.metaData.entrySet()){
            tempMap.put(entry.getKey(), entry.getValue());
        }
        return tempMap;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", regNo=" + regNo +
                ", metaData=" + metaData +
                '}';
    }
}
