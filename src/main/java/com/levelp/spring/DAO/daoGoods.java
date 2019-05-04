package com.levelp.spring.DAO;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import com.levelp.spring.Entity.*;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class daoGoods implements interGoods{

    @Autowired
    SessionFactory factory;

    public GoodsEntity findById(int id) {
        return factory.openSession().get(GoodsEntity.class, id);
    }

    public void save(GoodsEntity GoodsEntity) {
        Session session = factory.openSession();
        Transaction tx1 = session.beginTransaction();
        session.save(GoodsEntity);
        tx1.commit();
        session.close();
    }

    public void update(GoodsEntity GoodsEntity) {
        Session session = factory.openSession();
        Transaction tx1 = session.beginTransaction();
        session.update(GoodsEntity);
        tx1.commit();
        session.close();
    }

    public void delete(GoodsEntity GoodsEntity) {
        Session session = factory.openSession();
        Transaction tx1 = session.beginTransaction();
        session.delete(GoodsEntity);
        tx1.commit();
        session.close();
    }

    public OrdersEntity findAutoById(int customerid) {
        return factory.openSession().get(OrdersEntity.class, customerid);
    }


    public List<GoodsEntity> findAll() {
        Session session = factory.openSession();
        List<GoodsEntity> goodsEntities = (List<GoodsEntity>) session.createQuery("From GoodsEntity").list();
        session.close();
        return goodsEntities;
    }

    public List<GoodsEntity> findGoodsByProducer(ProducerEntity producerEntity) {
        Session session = factory.openSession();
        Query query = session.createQuery("From GoodsEntity G" +
                " where G.producerByProducerId = :producer");
        query.setParameter("producer", producerEntity);
        List<GoodsEntity> goodsEntities = (List<GoodsEntity>) query.list();
        session.close();
        return goodsEntities;
    }

}



