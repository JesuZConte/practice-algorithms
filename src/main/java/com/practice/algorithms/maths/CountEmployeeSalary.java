package com.practice.algorithms.maths;

import com.practice.algorithms.maths.entities.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountEmployeeSalary {

    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "employee_1", 50_000);
        Employee employee2 = new Employee(2, "employee_2", 25_000);
        Employee employee3 = new Employee(3, "employee_3", 70_000);
        List<Employee> employeeList = List.of(employee1, employee2, employee3);

        //employees with salary over 50 thousands
        System.out.println(employeeList.stream()
                .filter(employee -> employee.getSalary() > 50_000)
                .count()
        );

        //group employees with similar names
        Map<String, List<Employee>> employeeNamesMap = employeeList.stream()
                .collect(Collectors.groupingBy(employee -> employee.getName()));

    }


}
