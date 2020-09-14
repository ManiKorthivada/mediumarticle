package com.medium.articles.annotations.autowired;

import org.springframework.stereotype.Component;

@Component
public class Department {

    private String departmentName;
    private String departmentId;

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public void departmentDetails(){
        System.out.println("Details from department fetched using setter autowire");
    }
}
