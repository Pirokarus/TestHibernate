package olim;

import pojo.*;
import org.hibernate.Session;

/**
 * Created by Олимджон on 17.01.2017.
 */
public class test {

    public static void main(String[] args) {

        Session session = HibernateSessionFactory.getSessionFactory().openSession();

        session.beginTransaction();
        PkAttributeTypesEntity a1 = new PkAttributeTypesEntity();
        a1.setAttributeTypeId(1);
        a1.setName("Name");

        session.save(a1);
        session.getTransaction().commit();

        session.close();


    }
}
