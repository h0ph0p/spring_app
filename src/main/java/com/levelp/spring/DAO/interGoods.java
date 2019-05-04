package com.levelp.spring.DAO;

import com.levelp.spring.Entity.*;

import java.util.List;


public interface interGoods {

    GoodsEntity findById(int id);
    void save(GoodsEntity GoodsEntity);
    void update(GoodsEntity GoodsEntity);
    void delete(GoodsEntity GoodsEntity);
    OrdersEntity findAutoById(int customerid);
    List<GoodsEntity> findAll();
    List<GoodsEntity> findGoodsByProducer(ProducerEntity producerEntity);

}
