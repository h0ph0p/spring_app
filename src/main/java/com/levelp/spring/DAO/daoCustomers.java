package com.levelp.spring.DAO;

import com.levelp.spring.Entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

public class daoCustomers implements interCustomers{


    @Autowired
    SessionFactory factory;

    public CustomersEntity findCustomersById(int id) {
        return factory.openSession().get(CustomersEntity.class, id);
    }

    public void save(CustomersEntity CustomersEntity) {
        Session session = factory.openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(CustomersEntity);
        tx1.commit();
        session.close();
    }

    public void update(CustomersEntity CustomersEntity) {
        Session session = factory.openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(CustomersEntity);
        tx1.commit();
        session.close();
    }

    public void delete(CustomersEntity CustomersEntity) {
        Session session = factory.openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(CustomersEntity);
        tx1.commit();
        session.close();
    }
//
//    public TotalOrdersEntity findOrderById(int customerid) {
//        return factory.openSession().get(TotalOrdersEntity.class, customerid);
//    }



    public List<CustomersEntity> findAllCustomers() {
        List<CustomersEntity> users = (List<CustomersEntity>)  factory.openSession().createQuery("From CustomersEntity").list();
        return users;
    }

    public CustomersEntity findCustomersByLogin(String login){ //возвращает сразу пароль
        Session session = factory.openSession();
        Query query = session.createQuery("from CustomersEntity C " +
                "where C.login = :login");
        query.setParameter("login", login);
        CustomersEntity res = ( (CustomersEntity) query.getSingleResult());
        session.close();
        return res;
    }

}
