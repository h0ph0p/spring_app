package com.levelp.spring.DAO;


import com.levelp.spring.Entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;


public class daoReceiveT implements interReceiveT{

    @Autowired
    SessionFactory factory;


    public ReceiveTEntity findReceiveTById(int id) {
        return factory.openSession().get(ReceiveTEntity.class, id);
    }

    public void save(ReceiveTEntity ReceiveTEntity) {
        Session session = factory.openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(ReceiveTEntity);
        tx1.commit();
        session.close();
    }

    public void update(ReceiveTEntity ReceiveTEntity) {
        Session session = factory.openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(ReceiveTEntity);
        tx1.commit();
        session.close();
    }

    public void delete(ReceiveTEntity ReceiveTEntity) {
        Session session = factory.openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(ReceiveTEntity);
        tx1.commit();
        session.close();
    }

//    public daoTotalOrders findOrderByIкd(int customerid) {
//        return factory.openSession().get(daoTotalOrders.class, customerid);
//    }

    public List<ReceiveTEntity> findAllReceiveT() {
        List<ReceiveTEntity> users = (List<ReceiveTEntity>)  factory.openSession().createQuery("From ReceiveTEntity").list();
        return users;
    }
}


