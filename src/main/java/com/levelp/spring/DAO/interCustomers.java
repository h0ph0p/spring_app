package com.levelp.spring.DAO;

import com.levelp.spring.Entity.*;

import java.util.List;

public interface interCustomers {

    CustomersEntity findCustomersById(int id);
    void save(CustomersEntity CustomersEntity);
    void update(CustomersEntity CustomersEntity);
    void delete(CustomersEntity CustomersEntity);
//    TotalOrdersEntity findOrderById(int customerid);
    List<CustomersEntity> findAllCustomers();
    CustomersEntity findCustomersByLogin(String login);

}
