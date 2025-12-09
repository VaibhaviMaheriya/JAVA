package org.OTMmapping.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Entity
@Data

public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String email;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Orders> order = new ArrayList<>();

    public Customer() {}

    public Customer(String name, String email,List<Orders> order) {
        this.name = name;
        this.email = email;
        this.order = order;
    }
}
