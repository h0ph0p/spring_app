package com.levelp.spring.DAO;

import com.levelp.spring.Entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;


public class daoProducer implements interProducer{

    @Autowired
    SessionFactory factory;

    public ProducerEntity findById(int id) {
        return factory.openSession().get(ProducerEntity.class, id);
    }

    public void save(ProducerEntity ProducerEntity) {
        Session session = factory.openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(ProducerEntity);
        tx1.commit();
        session.close();
    }

    public void update(ProducerEntity ProducerEntity) {
        Session session = factory.openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(ProducerEntity);
        tx1.commit();
        session.close();
    }

    public void delete(ProducerEntity ProducerEntity) {
        Session session = factory.openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(ProducerEntity);
        tx1.commit();
        session.close();
    }

    public daoTotalOrders findOrderById(int customerid) {
        return factory.openSession().get(daoTotalOrders.class, customerid);
    }

    public List<ProducerEntity> findAll() {
        List<ProducerEntity> users = (List<ProducerEntity>)  factory.openSession().createQuery("From ProducerEntity").list();
        return users;
    }
}
