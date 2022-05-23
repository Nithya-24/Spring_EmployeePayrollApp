package com.example.employeepayrollapp.model;

import com.example.employeepayrollapp.dto.EmployeePayrollDTO;
import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
public class EmployeePayrollData {

    @Id
    private int empId;
    private String name;
    private long salary;

    public EmployeePayrollData(int empId, EmployeePayrollDTO employeePayrollDTO) {
        this.empId=empId;
        this.name=employeePayrollDTO.name;
        this.salary=employeePayrollDTO.salary;
    }

    public EmployeePayrollData() {

    }
    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getSalary() {
        return salary;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }
}