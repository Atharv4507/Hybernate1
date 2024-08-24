package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Student;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Configuration con = new Configuration().configure();
        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        Student s1 = new Student();
        s1.setSname("Hermoiny Grenger");
        s1.setScity("London");
        s1.setSpercentage(99.20);
        System.out.println(session.save(s1));
        // Student studentToDelete = session.get(Student.class, 4);
        // if (studentToDelete != null) {
        //     session.delete(studentToDelete);
        // } else {
        //     System.out.println("Student with ID 2 not found.");
        // }
        //session.delete(2); //This will not work above should use.
        tx.commit();
        session.close();
    }
}