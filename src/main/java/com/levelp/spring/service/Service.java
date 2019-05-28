package com.levelp.spring.service;

import com.levelp.spring.DAO.daoTotalOrders;
import com.levelp.spring.Entity.*;

import java.util.List;

public interface Service {

    CharacteristicsEntity findByTypeId(int type_id);
    void save(CharacteristicsEntity CharacteristicsEntity);
    void update(CharacteristicsEntity CharacteristicsEntity);
    void delete(CharacteristicsEntity CharacteristicsEntity);
    List<CharacteristicsEntity> findAllCharacteristics();
    GoodsEntity findCharacteristicByType(int type_id);

    CustomersEntity findCustomersById(int id);
    void save(CustomersEntity CustomersEntity);
    void update(CustomersEntity CustomersEntity);
    void delete(CustomersEntity CustomersEntity);
//    TotalOrdersEntity findOrderById(int customerid);
    List<CustomersEntity> findAllCustomers();
    CustomersEntity findCustomersByLogin(String login);

    GoodsEntity findGoodById(int id);
    void save(GoodsEntity GoodsEntity);
    void update(GoodsEntity GoodsEntity);
    void delete(GoodsEntity GoodsEntity);
    List<GoodsEntity> findAllGoods();
    List<GoodsEntity> findGoodsByProducer(String producerEntity);
    List<GoodsEntity> findGoodsByType(String producerEntity);


    OrdersEntity findOrderById(int id);
    void save(OrdersEntity OrdersEntity);
    void update(OrdersEntity OrdersEntity);
    void delete(OrdersEntity OrdersEntity);
    List<OrdersEntity> findAllOrders();
    List<OrdersEntity> findOrdersByTotalOrder(int id);

//    OrdersEntity findOrderByСustomerId(int customerid);

    ProducerEntity findProducerById(int id);
    void save(ProducerEntity ProducerEntity);
    void update(ProducerEntity ProducerEntity);
    void delete(ProducerEntity ProducerEntity);
//    daoTotalOrders findOrderByСustomerId(int customerid);
    List<ProducerEntity> findAllProducer();

    ReceiveTEntity findReceiveTById(int id);
    void save(ReceiveTEntity ReceiveTEntity);
    void update(ReceiveTEntity ReceiveTEntity);
    void delete(ReceiveTEntity ReceiveTEntity);
    List<ReceiveTEntity> findAllReceiveT();

    TotalOrdersEntity findTotalOrderById(int id);
    void save(TotalOrdersEntity TotalOrdersEntity);
    void update(TotalOrdersEntity TotalOrdersEntity);
    void delete(TotalOrdersEntity TotalOrdersEntity);
    List<TotalOrdersEntity> findAllTotalOrders();
    public List<TotalOrdersEntity> findTotalOrderByCustomer(int customerId);



}
