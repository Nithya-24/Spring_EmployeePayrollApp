package com.example.employeepayrollapp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@Slf4j
public class EmployeePayrollAppApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(EmployeePayrollAppApplication.class, args);
        log.info("Employee Payroll App started in {} environment",
                applicationContext.getEnvironment().getProperty("environment"));
        System.out.println("Welcome");
    }

}