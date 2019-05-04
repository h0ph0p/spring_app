package com.levelp.spring.DAO;

import com.levelp.spring.Entity.*;

import java.util.List;


public interface interOrders {

    OrdersEntity findById(int id);
    void save(OrdersEntity OrdersEntity);
    void update(OrdersEntity OrdersEntity);
    void delete(OrdersEntity OrdersEntity);
    List<OrdersEntity> findAll();
//    daoTotalOrders findOrderById(int customerid);

}
