package com.levelp.spring.DAO;

import com.levelp.spring.Entity.*;

import java.util.List;


public interface interGoods {

    GoodsEntity findGoodById(int id);
    void save(GoodsEntity GoodsEntity);
    void update(GoodsEntity GoodsEntity);
    void delete(GoodsEntity GoodsEntity);
//    OrdersEntity findAutoById(int customerid);
    List<GoodsEntity> findAllGoods();
    List<GoodsEntity> findGoodsByProducer(String producerEntity);
    List<GoodsEntity> findGoodsByType(String producerEntity);

}
