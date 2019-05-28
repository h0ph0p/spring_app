package com.levelp.spring.DAO;

import com.levelp.spring.Entity.*;

import java.util.List;


public interface interTotalOrders {

    TotalOrdersEntity findTotalOrderById(int id);
    void save(TotalOrdersEntity TotalOrdersEntity);
    void update(TotalOrdersEntity TotalOrdersEntity);
    void delete(TotalOrdersEntity TotalOrdersEntity);
    List<TotalOrdersEntity> findAllTotalOrders();
    List<TotalOrdersEntity> findTotalOrderByCustomer(int customerId);

}
