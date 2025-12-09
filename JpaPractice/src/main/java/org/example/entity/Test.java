package org.example.entity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.util.List;

public class Test {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myJpaUnit");
        EntityManager em = emf.createEntityManager();


//        insert data
//        em.getTransaction().begin();
//        EmployeeEntity entity = new EmployeeEntity("Sam","s@gmail.com", 678901245L);
//        em.persist(entity);
//        em.getTransaction().commit();
//        em.clear();


//        reading Data
//        EmployeeEntity entity =  em.find(EmployeeEntity.class, 1);
//        System.out.println(entity);
//        em.clear();

//        read all data
//        List<EmployeeEntity> entities = em.createQuery("from EmployeeEntity", EmployeeEntity.class).getResultList();
//        entities.forEach(System.out::println);


//        update data
//        em.getTransaction().begin();
//        EmployeeEntity employee = em.find(EmployeeEntity.class, 1);
//        employee.setEmail("vaibhavi@gmail.com");
//        em.persist(employee);
//        em.getTransaction().commit();
//        em.close();

//        delete data
//        em.getTransaction().begin();
//        EmployeeEntity entity = em.find(EmployeeEntity.class,3);
//        em.remove(entity);
//
//        em.getTransaction().commit();
//        em.close();




    }
}
