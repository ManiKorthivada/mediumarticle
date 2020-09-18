package com.medium.articles.controller;

import com.medium.articles.dto.Employee;
import com.medium.articles.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employees")
    public List<Employee> findAllEmployees() {
        return employeeService.findAll();
    }

    @PostMapping("/employees")
    public void addEmployee(@RequestBody Employee employee) {
        employeeService.addEmployee(employee);
    }

    @PutMapping("/employees/{id}")
    void replaceEmployee(@RequestBody Employee newEmployee, @PathVariable String id) {
        employeeService.updateEmployee(newEmployee, id);
    }

    @DeleteMapping("/employees/{id}")
    void deleteEmployee(@PathVariable String id) {
        employeeService.deleteEmployee(id);
    }

}
