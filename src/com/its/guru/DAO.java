package com.its.guru;

import org.hibernate.HibernateException;
import org.hibernate.Session;

public class DAO {
    public void addUser(String fn,String ln,String un,String pass,String address,String gender) {
        try {
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            EntityClass entityClass = new EntityClass();
            entityClass.setPassword(pass);
            session.save(entityClass);
            session.getTransaction().commit();
            HibernateUtil.shutdown();
        }catch (HibernateException e){
            System.out.println(e.getMessage());
            System.out.print("Error!");
        }
    }
}
