package com.programs.java8.employee;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EmployeeTest {
    public static void main(String[] args) {

        Employee e = new Employee(101,"Pritam", 2000, "B","cse");
        Employee e2 = new Employee(803,"zumar", 4000, "J","it");
        Employee e3 = new Employee(301,"Rahul", 4000, "G","cse");
        Employee e4 = new Employee(701,"Rajeev", 8000, "B","ece");
        Employee e5 = new Employee(201,"Sanjeet", 11000, "G","ece");
        Employee e6 = new Employee(543,"Sharma", 4433, "B","mec");
        Employee e7 = new Employee(501,"Modi", 8777, "B","ece");

        List<Employee> empList = Arrays.asList(e,e2,e3,e4,e5,e6,e7);

        System.out.println(empList);

//        // sort emp object on basis of salary
//        Comparator<Employee> ee = Comparator.comparing(Employee::getName);
//
//        List<Employee> sortedList =  empList.stream().sorted(Comparator.comparing(Employee:: getSalary).thenComparing(Comparator.comparing(Employee::getName))).collect(Collectors.toList());
//        System.out.println(sortedList);
//        Employee emp[] = new Employee[4];
//        emp[1]= e4;
//        System.out.println(emp[1]);
//        System.out.println("0---------------------");
//        // Accumulate employee Name
//        List<String> lm =empList.stream().map(Employee::getName).collect( Collectors.toList());
//        System.out.println(lm);
        // sum of group by dept sum of salary

        // Compute sum of salaries by department
        Map<String, Integer> ll = empList.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.summingInt(Employee::getSalary)));
        System.out.println(ll);
        // output {cse=6000, ece=27777, mec=4433, it=4000}

        // Group employee by department
        Map<String,List<Employee>> ls = empList.stream().collect(Collectors.groupingBy(Employee::getDept));
        System.out.println(ls);
        // output {cse=[Employee: [roll: 101, name: Pritam, salary: 2000, Grade: B, Dept:cse]],{cse=[Employee: [roll: 101, name: Pritam, salary: 2000, Grade: B, Dept:cse]}

        // Compute sum of salaries of employee
        int sal = empList.stream().collect(Collectors.summingInt(Employee::getSalary));
        System.out.println(sal);
        // output 42210

        // Accumulate names into a List
        List<String> empNames = empList.stream().map(emp->emp.getName()).collect(Collectors.toList());
        System.out.println(empNames);
        // output [Pritam, zumar, Rahul, Rajeev, Sanjeet, Sharma, Modi]

        int sum = Stream.of(2, 5, 7, 8, 3, 6, 15, 9,25)
                .filter(n -> n > 10)
                .filter(n -> n % 5 == 0)
                .mapToInt(s -> s)
                .sum();
        System.out.println(sum);

        IntStream stream = "12345_abcdefg".chars();
        stream.forEach(p -> System.out.println(p));

    }
}
