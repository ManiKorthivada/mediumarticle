package com.medium.articles;

import com.medium.articles.annotations.autowired.Employee;
import com.medium.articles.annotations.autowired.EmployeeService;
import com.medium.articles.annotations.qualifier.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class MediumApplication {


    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private Employee employee;

    @Autowired
    @Qualifier("wildAnimal")
    private Animal wildAnimal;

    @Autowired
    @Qualifier("domesticAnimal")
    private Animal domesticAnimal;

    public static void main(String[] args) {
        SpringApplication.run(MediumApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            System.out.println("Autowired Example .... :" + employeeService.getEmployeeDetails());
            employee.departmentDetails();
            System.out.println(wildAnimal.getType());
            System.out.println(domesticAnimal.getType());
            configMethod();
        };
    }

    private void configMethod() {
        System.out.println("Employee bean instance created using config class .... Name: " + employee.getEmployeeName() + " Id: " + employee.getEmployeeId());
    }
}
