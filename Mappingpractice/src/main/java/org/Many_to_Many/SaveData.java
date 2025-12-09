package org.Many_to_Many;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class SaveData {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myJpaUnit");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

        Subjects sub1 = new Subjects();
        sub1.setName("Java");
        sub1.setMentor_name("Amit Sir");

        Subjects sub2 = new Subjects();
        sub2.setName("Manual Testing");
        sub2.setMentor_name("Akshay Sir");

        Subjects sub3 = new Subjects();
        sub3.setName("SQL");
        sub3.setMentor_name("Bharath sir");

        Student2 s1 = new Student2();
        s1.setName("Allen");
        s1.setAge(20);
        s1.setDob(LocalDate.of(2005,2,17));
        s1.getSubjects().add(sub1);
        s1.getSubjects().add(sub2);
        s1.getSubjects().add(sub3);

        Student2 s2 = new Student2();
        s2.setName("Blake");
        s2.setAge(21);
        s2.setDob(LocalDate.of(2004,5,5));
        s2.getSubjects().add(sub1);
        s2.getSubjects().add(sub2);
        s2.getSubjects().add(sub3);

        Student2 s3 = new Student2();
        s3.setName("Sam");
        s3.setAge(20);
        s3.setDob(LocalDate.of(2005,10,19));
        s3.getSubjects().add(sub1);
        s3.getSubjects().add(sub2);
        s3.getSubjects().add(sub3);


        et.begin();
        em.persist(sub1);
        em.persist(sub2);
        em.persist(sub3);

        em.persist(s1);
        em.persist(s2);
        em.persist(s3);

        et.commit();

    }
}
