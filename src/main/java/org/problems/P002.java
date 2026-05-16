//  Second highest salary from employee

package org.problems;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class P002 {
    public static void main(String args[]){
        List<Employee> employees = Arrays.asList(
                new Employee(1, "A", 5000),
                new Employee(2, "B", 7000),
                new Employee(3, "C", 7000),
                new Employee(4, "D", 6000),
                new Employee(5, "E", 4000)
        );
        System.out.println(secondHighestSalary(employees));
        secondHighestSalaryUsingStream(employees);
    }

    public static int secondHighestSalary(List<Employee> employees) {
        return 0;
    }

    public static void secondHighestSalaryUsingStream(List<Employee> employees) {
        Optional<Integer> secondHighestSalary = employees.stream().map(e -> e.salary)
                .distinct().sorted(Comparator.reverseOrder())
                .skip(1).findFirst();
        System.out.println(secondHighestSalary.get());
    }
}

class Employee {
    int id;
    String name;
    int salary;

    Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}