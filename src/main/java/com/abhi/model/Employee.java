package com.abhi.model;

import lombok.Data;

@Data
public class Employee {
    private Integer empNo;
    private String empName = "Abhi";
    private String empAddr;
    private Double empSal;

    public Employee() {
        System.out.println("Zero Param Constructor of Employer got called");
    }
}
