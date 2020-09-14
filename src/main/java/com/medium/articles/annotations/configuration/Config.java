package com.medium.articles.annotations.configuration;

import com.medium.articles.annotations.autowired.Employee;
import com.medium.articles.annotations.autowired.EmployeeAddress;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public Employee employee() {
        EmployeeAddress employeeAddress = new EmployeeAddress();
        Employee employee = new Employee(employeeAddress);
        employee.setEmployeeId("89191");
        employee.setEmployeeName("Joeee");
        return employee;
    }
}
