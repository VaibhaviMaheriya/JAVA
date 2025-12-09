package org.Many_to_One;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Iterator;
import java.util.List;

public class SaveDetail {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("myJpaUnit");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();

//        Mentor m1 = new Mentor();
//        m1.setName("Maneesha mam");
//        m1.setExperience(3.0);
//        m1.setSubject("Web Technology");
//        m1.setMobile(9654123780l);
//
//        Student1 s1 = new Student1();
//        s1.setName("Vaibhavi");
//        s1.setAge(21);
//        s1.setDob(LocalDate.of(2004, 01, 05));
//        s1.setMentor(m1);
//
//        Student1 s2 = new Student1();
//        s2.setName("Aditi");
//        s2.setAge(22);
//        s2.setDob(LocalDate.of(2003, 11, 07));
//        s2.setMentor(m1);
//
//        Student1 s3 = new Student1();
//        s3.setName("Pranshu");
//        s3.setAge(22);
//        s3.setDob(LocalDate.of(2003, 03, 19));
//        s3.setMentor(m1);
//
//        Student1 s4 = new Student1();
//        s4.setName("Govind");
//        s4.setAge(21);
//        s4.setDob(LocalDate.of(2003, 06, 07));
//        s4.setMentor(m1);
//
//        et.begin();
//        em.persist(m1);
//        em.persist(s1);
//        em.persist(s2);
//        em.persist(s3);
//        em.persist(s4);
//        et.commit();

        Query query = em.createQuery("select s from Student1 s");
        List<Student1> list = query.getResultList();

        Mentor m1 = new Mentor();
        m1.setName("Ram Sir");
        m1.setExperience(3.0);
        m1.setSubject("Core Java");
        m1.setMobile(6785569885l);

        Mentor oldMentor = list.get(0).getMentor();

        et.begin();
        for (Student1 s : list) {
            s.setMentor(m1);
        }
        em.remove(oldMentor);

        et.commit();

    }
}
