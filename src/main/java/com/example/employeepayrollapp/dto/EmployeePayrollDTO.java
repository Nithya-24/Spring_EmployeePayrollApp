package com.example.employeepayrollapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmployeePayrollDTO {

    public String name;
    public long salary;

}