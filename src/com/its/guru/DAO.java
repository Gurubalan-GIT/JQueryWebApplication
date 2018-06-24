package com.its.guru;

import org.hibernate.HibernateException;
import org.hibernate.Session;

public class DAO {
    public void addUser(String email,String password) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            EntityClass entityClass = new EntityClass();
            entityClass.setEmail(email);
            entityClass.setPassword(password);
            session.save(entityClass);
            session.getTransaction().commit();
            HibernateUtil.shutdown();
        }catch (HibernateException e){
            System.out.println(e.getMessage());
            System.out.print("Error!");
        }
    }
}
