package com.practice.algorithms.maths;

import com.practice.algorithms.maths.entities.Employee;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SortEmployeeBasedOnSalary {

    public static void main(String[] args) {
        Employee employee1 = new Employee(1, "A", 500000);
        Employee employee2 = new Employee(2, "B", 5000);
        Employee employee3 = new Employee(3, "C", 123);
        Employee employee4 = new Employee(4, "D", 673);
        Employee employee5 = new Employee(5, "E", 510000);
        Employee employee6 = new Employee(6, "F", 9999);

        List<Employee> employees = List.of(employee1, employee2, employee3, employee4, employee5, employee6);

        //ordenado de mayor a menor
        employees.stream()
                .sorted((e1, e2) -> Integer.compare(e2.getSalary(), e1.getSalary()))
                .collect(Collectors.toList())
                .forEach(employee -> System.out.println("Employee " + employee.getName() + " salary is " + employee.getSalary()));

        System.out.println("---------------------------------");

        //o también...
        employees.stream()
                .sorted((e1, e2) -> e2.getSalary() - e1.getSalary())
                .collect(Collectors.toList())
                .forEach(employee -> System.out.println("Employee " + employee.getName() + " salary is " + employee.getSalary()));


        System.out.println("---------------------------------");

        //ordenado de menor a mayor
        employees.stream()
                .sorted(Comparator.comparingInt(Employee::getSalary))
                .collect(Collectors.toList())
                .forEach(employee -> System.out.println("Employee " + employee.getName() + " salary is " + employee.getSalary()));
        System.out.println("---------------------------------");

        //obtener el 3ro más alto
        Optional<Employee> employee = employees.stream()
                .sorted((e1, e2) -> e2.getSalary() - e1.getSalary())
                .skip(2)
                .findFirst();

        System.out.println("Third higher salary is: " + employees.stream()
                .sorted((e1, e2) -> e2.getSalary() - e1.getSalary())
                .skip(2)
                .map(Employee::getName)
                .findFirst().get());
    }
}
