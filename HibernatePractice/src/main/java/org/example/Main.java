package org.example;

import org.example.Util.HibernateUtil;
import org.example.entity.EmployeeEntity;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();

        Transaction tx = session.beginTransaction();

//        Inserting multiple data

//        Scanner sc = new Scanner(System.in);
//        System.out.println("How much data do you want to add?");
//        int n = sc.nextInt();
//        sc.nextLine();
//
//        for(int i=0; i<n; i++){
//            System.out.println("Enter name: ");
//            String name =sc.nextLine();
//            System.out.println("Enter email: ");
//            String email = sc.nextLine();
//
//            EmployeeEntity employee = new EmployeeEntity(name,email);
//
//            session.persist(employee);
//        }

//               Updating value

//        EmployeeEntity employee = session.get(EmployeeEntity.class, 1);
//        employee.setEmail("riya@gmail.com");
//
//        session.update(employee);

//               Reading Data
//        EmployeeEntity employee = session.get(EmployeeEntity.class, 1);
//
//        System.out.println(employee.getId()+" "+employee.getName()+" "+employee.getEmail());


//               Deleting data

//        EmployeeEntity employee = session.get(EmployeeEntity.class, 4);
//        session.delete(employee);

        tx.commit();

        session.close();

        System.out.println("Saved successfully");
    }
}
