package org.OTMmapping.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String orderDate;

    private  double price;
    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    public Orders(String orderDate, double price, Customer customer) {
        this.orderDate = orderDate;
        this.price = price;
        this.customer = customer;
    }

    public Orders() {}

}
