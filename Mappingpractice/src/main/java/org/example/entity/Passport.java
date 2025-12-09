package org.example.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Passport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String passportNum;

    @OneToOne(mappedBy = "passport")
    private Person person ;

    public Passport(String passportNum) {
        this.passportNum = passportNum;
    }
    public Passport() {}
}
