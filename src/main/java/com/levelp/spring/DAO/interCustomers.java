package com.levelp.spring.DAO;

import com.levelp.spring.Entity.*;

import java.util.List;

public interface interCustomers {

    CustomersEntity findById(int id);
    void save(CustomersEntity CustomersEntity);
    void update(CustomersEntity CustomersEntity);
    void delete(CustomersEntity CustomersEntity);
    daoTotalOrders findOrderById(int customerid);
    List<CustomersEntity> findAll();

}
