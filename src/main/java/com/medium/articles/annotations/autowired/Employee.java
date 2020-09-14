package com.medium.articles.annotations.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class Employee {

    private String employeeName;
    private String employeeId;
    private Department department;

    @Autowired
    public Employee(EmployeeAddress employeeAddress) {
        employeeAddress.getEmployeeAddress();
    }

    public Department getDepartment() {
        return department;
    }

    @Autowired
    public void setDepartment(Department department) {
        this.department = department;
    }

    public void departmentDetails(){
        department.departmentDetails();
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }
}
