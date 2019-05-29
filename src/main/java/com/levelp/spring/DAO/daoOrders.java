package com.levelp.spring.DAO;


import com.levelp.spring.Entity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;


public class daoOrders implements interOrders{


    @Autowired
    SessionFactory factory;


    public OrdersEntity findOrderById(int id) {
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

    public TotalOrdersEntity findOrderByСustomerId(int customerid) {
        return factory.openSession().get(TotalOrdersEntity.class, customerid);
    }

    public List<OrdersEntity> findAllOrders() {
        List<OrdersEntity> users = (List<OrdersEntity>)  factory.openSession().createQuery("From OrdersEntity").list();
        return users;
    }

//    public List<OrdersEntity> findOrdersByTotalOrder() {
//        return
//    }

    public List<OrdersEntity> findOrdersByTotalOrder(int id) {
        Session session = factory.openSession();
        Query query = session.createQuery("From OrdersEntity G" +
                " where G.totalOrdersByOrderId.orderId = :total_id");
        query.setParameter("total_id", id);
        List<OrdersEntity> ordersEntities = (List<OrdersEntity>) query.list();
        session.close();
        return ordersEntities;
    }
}


