package org.example.entity;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Test {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myJpaUnit");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
//        Passport passport = new Passport("K1234567");
//        Person person = new Person("Allen",passport);
//
//        em.persist(passport);
//        em.persist(person);


//        Passport passport= new Passport();
//        passport.setPassportNum("IND12345");
//
//        Person person = new Person();
//        person.setName("John");
//        person.setPassport(passport);
//
//        em.persist(person);

//        Person p = em.find(Person.class,1);
//        System.out.println(p.getName());
//        System.out.println(p.getPassport().getPassportNum());


//        update child through parent

//        Person p = em.find(Person.class, 1);
//        p.getPassport().setPassportNum("IND54321");

//        Person p = em.find(Person.class,2);
//        Passport newPassport = new Passport();
//        newPassport.setPassportNum("IND87654");
//
//        p.setPassport(newPassport);


//        Passport passport = em.find(Passport.class, 1);
//        System.out.println(passport.getPerson().getName());



        em.getTransaction().commit();
        em.close();
    }
}
