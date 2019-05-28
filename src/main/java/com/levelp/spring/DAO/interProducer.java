package com.levelp.spring.DAO;

import com.levelp.spring.Entity.*;

import java.util.List;


public interface interProducer {

    ProducerEntity findProducerById(int id);
    void save(ProducerEntity ProducerEntity);
    void update(ProducerEntity ProducerEntity);
    void delete(ProducerEntity ProducerEntity);
    daoTotalOrders findOrderByСustomerId(int customerid);
    List<ProducerEntity> findAllProducer();

}
