package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jessyca", "Humildes", 123));
        employeeList.add(new Employee("Jake", "Young", 345));
        employeeList.add(new Employee("Wivi", "Bento", 354));
        employeeList.add(new Employee("Bia", "Oliveira", 547));

        //get the whole list of employees
        employeeList.forEach(employee -> System.out.println(employee));

        //in case i want to get employee 2
        System.out.println(employeeList.get(1));

        //check to see if a list is empty#
        System.out.print(employeeList.isEmpty());

        //replacing positions
        employeeList.set(1,new Employee("jh", "hj", 5467));
        employeeList.forEach(employee -> System.out.println(employee));

        //to get the number of items in the list/ how many employees we have in the list
        System.out.println(employeeList.size());

        //add employee in an specific position
        employeeList.add(3, new Employee("Hellen", "Morcatti", 3456));
        employeeList.forEach(employee -> System.out.println(employee));

        //searching the list
        System.out.println(employeeList.contains(new Employee("Hellen", "Morcatti", 3456)));
        System.out.println(employeeList.contains(new Employee("John", "Doe", 4567)));

        //what index the employee is
        System.out.println(employeeList.indexOf(new Employee("Hellen","Morcatti",3456)));

        //remove items from the list faster providing the index
        employeeList.remove(2);
        employeeList.forEach(employee -> System.out.println(employee));


    }
}
