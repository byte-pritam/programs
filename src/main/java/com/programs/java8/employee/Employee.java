package com.programs.java8.employee;


public class Employee {

    private int roll;
    private String name;
    private int salary;
    private String grade;
    private String dept;


    public Employee(int roll, String name, int salary, String grade, String dept){
        this.roll = roll;
        this.name = name;
        this.salary = salary;
        this.grade = grade;
        this.dept = dept;

    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getDept(){
        return dept;
    }

    public void setDept(String dept){
        this.dept = dept;
    }

    public String toString(){
        return "Employee: ["+ "roll: "+roll+ ", name: "+name+", salary: "+salary+", Grade: "+grade +", Dept:"+dept+"]";
    }
}
