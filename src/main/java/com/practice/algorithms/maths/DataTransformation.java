package com.practice.algorithms.maths;

import com.practice.algorithms.maths.entities.Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DataTransformation {

    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(new Employee(1, "John", 200000, Arrays.asList("123", "456")),
                new Employee(2, "Harry", 100000, Arrays.asList("567", "890")),
                new Employee(3, "Mathew", 50000, Arrays.asList("034", "820")));


        //Data Transformation map

        System.out.println(employeeList.stream()
                .map(Employee::getName)
                .collect(Collectors.toList()));

        //Get all phone numbers of the Employee

        System.out.println(employeeList.stream()
                .flatMap(employee -> employee.getPhoneNumbers().stream())
                .collect(Collectors.toList())
        );
    }
}
