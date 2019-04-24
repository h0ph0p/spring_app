package com.levelp.spring.DAO;


import com.levelp.spring.Entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;


public class daoOrders {

    @Autowired
    SessionFactory factory;


    public OrdersEntity findById(int id) {
        return factory.openSession().get(OrdersEntity.class, id);
    }

    public void save(OrdersEntity OrdersEntity) {
        Session session = factory.openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(OrdersEntity);
        tx1.commit();
        session.close();
    }

    public void update(OrdersEntity OrdersEntity) {
        Session session = factory.openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(OrdersEntity);
        tx1.commit();
        session.close();
    }

    public void delete(OrdersEntity OrdersEntity) {
        Session session = factory.openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(OrdersEntity);
        tx1.commit();
        session.close();
    }

//    public daoTotalOrders findOrderById(int customerid) {
//        return HibernateSessionFactoryUtil.getSessionFactory().openSession().get(daoTotalOrders.class, customerid);
//    }

    public List<OrdersEntity> findAll() {
        List<OrdersEntity> users = (List<OrdersEntity>)  factory.openSession().createQuery("From OrdersEntity").list();
        return users;
    }
}


