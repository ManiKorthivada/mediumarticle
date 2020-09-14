package com.medium.articles.annotations.autowired;

import org.springframework.stereotype.Component;

@Component
public class EmployeeServiceImpl implements EmployeeService {

    @Override
    public String getEmployeeDetails() {
        return "Employee Service Impl is called...";
    }
}
