package org.example.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "employeeDetails")

public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name ;
    private String email;
    private long mobile;

    public EmployeeEntity(String name, String email, long mobile) {
        this.name = name;
        this.email = email;
        this.mobile = mobile;
    }
    public EmployeeEntity() {}
}
