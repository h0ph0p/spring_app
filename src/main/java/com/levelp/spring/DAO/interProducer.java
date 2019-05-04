package com.levelp.spring.DAO;

import com.levelp.spring.Entity.*;

import java.util.List;


public interface interProducer {

    ProducerEntity findById(int id);
    void save(ProducerEntity ProducerEntity);
    void update(ProducerEntity ProducerEntity);
    void delete(ProducerEntity ProducerEntity);
//    daoTotalOrders findOrderById(int customerid);
    List<ProducerEntity> findAll();

}
