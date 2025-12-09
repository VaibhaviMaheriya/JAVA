package org.OTMmapping.entity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Test2 {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myJpaUnit");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();

//        Customer c1 = new Customer();
//        c1.setName("Jack");
//        c1.setEmail("j@gmail.com");
//
//        Orders o1 = new Orders();
//        o1.setOrderDate("2025-12-10");
//        o1.setPrice(200.32);
//        o1.setCustomer(c1);
//
//        Orders o2 = new Orders();
//        o2.setOrderDate("2025-12-11");
//        o2.setPrice(3000);
//        o2.setCustomer(c1);
//
//        Customer c2 = new Customer();
//        c2.setName("Sam");
//        c2.setEmail("s@gmail.com");
//
//        Orders o3 = new Orders();
//        o3.setOrderDate("2025-1-14");
//        o3.setPrice(780.99);
//        o3.setCustomer(c2);
//
//        Orders o4 = new Orders();
//        o4.setOrderDate("2025-1-15");
//        o4.setPrice(290.89);
//        o4.setCustomer(c2);
//
//        c1.getOrder().add(o1);
//        c1.getOrder().add(o2);
//
//        c2.getOrder().add(o3);
//        c2.getOrder().add(o4);
//
//        em.persist(c1);
//        em.persist(c2);

        Customer c = em.find(Customer.class, 1);

        System.out.println("Customer: " + c.getName());

        for (Orders order : c.getOrder()) {
            System.out.println(order.getOrderDate() + " = " + order.getPrice());
        }

        em.getTransaction().commit();
        em.close();


    }
}
