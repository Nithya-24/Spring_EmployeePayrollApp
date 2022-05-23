package com.example.employeepayrollapp;

import ch.qos.logback.core.CoreConstants;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeePayrollAppApplication {

    public static void main(String[] args) {

        SpringApplication.run(EmployeePayrollAppApplication.class, args);
        System.out.println("Welcome");
    }

}