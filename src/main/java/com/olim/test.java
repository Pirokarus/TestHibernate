package com.olim;

import com.olim.pojo.*;
import org.hibernate.Session;
import com.olim.session.*;

public class test {

    public static void main(String[] args) {

        System.out.println("Maven + Hibernate + Oracle");
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        PkAttributeTypesEntity a = new PkAttributeTypesEntity();

        a.setAttributeTypeId(3);
        a.setName("ccc");


        session.save(a);
        session.getTransaction().commit();


    }
}
