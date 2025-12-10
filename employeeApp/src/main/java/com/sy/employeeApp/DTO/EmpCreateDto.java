package com.sy.employeeApp.DTO;

import lombok.Data;

@Data
public class EmpCreateDto {
    private String name;
    private double salary;
    private String department;
    private String password;
}
