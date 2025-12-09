package com.sy.MiniJPAproject.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    @Column(unique = true)
    private String email;
    private String department;
    private double salary;
    private LocalDate dateOfJoining;
    private Long phone;

    public Employee(String name, String email, String department, double salary, LocalDate dateOfJoining, Long phone) {
        this.name = name;
        this.email = email;
        this.department = department;
        this.salary = salary;
        this.dateOfJoining = dateOfJoining;
        this.phone = phone;
    }
}
