package com.medium.articles;

import com.medium.articles.dto.Employee;
import com.medium.articles.repo.EmployeeRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;


@SpringBootApplication
public class MediumApplication {

    private static final Logger log = LoggerFactory.getLogger(MediumApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(MediumApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner(EmployeeRepository employeeRepository) {
        return args -> {
            employeeRepository.save(new Employee("Joe", 29));
            employeeRepository.save(new Employee("Jack", 30));
            employeeRepository.save(new Employee("Karan", 31));
            employeeRepository.save(new Employee("Mike", 32));


            log.info("Find All method ......");
            for (Employee employee : employeeRepository.findAll()) {
                log.info(employee.toString());
            }

            log.info("");
            log.info("Find by Id");
            Employee employee = employeeRepository.findById(1L);
            log.info(employee.toString());

            log.info("");
            log.info("Find by Id");
            List<Employee> employeeList = employeeRepository.findByName("Jack");
            log.info(employeeList.get(0).toString());

            log.info("");
            log.info("Find by Age");
            employeeList = employeeRepository.findByAge(29);
            log.info(employeeList.get(0).toString());
        };
    }
}
