package com.medium.articles.services;

import com.medium.articles.dto.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class EmployeeService {

    private List<Employee> employees = new ArrayList<>(Arrays.asList(new Employee("123", "John", "Library"),
            new Employee("234", "Joe", "Security")));

    public List<Employee> findAll() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void updateEmployee(Employee updateEmployee, String id) {
        int count = 0;
        for (Employee employee : employees) {
            if (employee.getId().equals(id)) {
                employees.set(count, employee);
            }
            count++;
        }
    }

    public void deleteEmployee(String id) {
        employees.removeIf(employee -> employee.getId().equals(id));
    }

}
