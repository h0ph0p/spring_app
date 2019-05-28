package com.levelp.spring.DAO;

import com.levelp.spring.Entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;


public class daoTotalOrders implements interTotalOrders{

    @Autowired
    SessionFactory factory;

    public TotalOrdersEntity findTotalOrderById(int id) {
        return factory.openSession().get(TotalOrdersEntity.class, id);
    }

    public void save(TotalOrdersEntity TotalOrdersEntity) {
        Session session = factory.openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(TotalOrdersEntity);
        tx1.commit();
        session.close();
    }

    public void update(TotalOrdersEntity TotalOrdersEntity) {
        Session session = factory.openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(TotalOrdersEntity);
        tx1.commit();
        session.close();
    }

    public void delete(TotalOrdersEntity TotalOrdersEntity) {
        Session session = factory.openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(TotalOrdersEntity);
        tx1.commit();
        session.close();
    }

//    public daoTotalOrders findOrderById(int customerid) {
//        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(daoTotalOrders.class, customerid);
//    }

    public List<TotalOrdersEntity> findAllTotalOrders() {
        List<TotalOrdersEntity> users = (List<TotalOrdersEntity>)  factory.openSession().createQuery("From TotalOrdersEntity").list();
        return users;
    }

    public List<TotalOrdersEntity> findTotalOrderByCustomer(int customerId) {
        Session session = factory.openSession();
        Query query = session.createQuery("From TotalOrdersEntity G" +
                " where G.customersByCustomerId.customerId = :custom");
        query.setParameter("custom", customerId);
        List<TotalOrdersEntity> totalOrdersEntity = (List<TotalOrdersEntity>) query.list();
        session.close();
        return totalOrdersEntity;
    }
}


