package com.levelp.spring.service;

import com.levelp.spring.DAO.*;
import com.levelp.spring.Entity.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ServImpl implements Service {

    @Autowired
    interCharact DAO;

    @Autowired
    interGoods interGoods;

    @Autowired
    interCustomers interCustomers;

    @Autowired
    interOrders interOrders;

    @Autowired
    interProducer interProducer;

    @Autowired
    interReceiveT interReceiveT;

    @Autowired
    interTotalOrders interTotalOrders;


    @Override
    public TotalOrdersEntity findTotalOrderById(int id) {
        return interTotalOrders.findTotalOrderById(id);
    }

    @Override
    public void save(TotalOrdersEntity TotalOrdersEntity) {
        interTotalOrders.save(TotalOrdersEntity);
    }

    @Override
    public void update(TotalOrdersEntity TotalOrdersEntity) {
        interTotalOrders.update(TotalOrdersEntity);
    }

    @Override
    public void delete(TotalOrdersEntity TotalOrdersEntity) {
        interTotalOrders.delete(TotalOrdersEntity);
    }

    @Override
    public List<TotalOrdersEntity> findAllTotalOrders() {
        return interTotalOrders.findAllTotalOrders();
    }

    @Override
    public List<TotalOrdersEntity> findTotalOrderByCustomer(int customerId) { return interTotalOrders.findTotalOrderByCustomer(customerId); }


    @Override
    public ReceiveTEntity findReceiveTById(int id) {
        return interReceiveT.findReceiveTById(id);
    }

    @Override
    public void save(ReceiveTEntity ReceiveTEntity) {
        interReceiveT.save(ReceiveTEntity);
    }

    @Override
    public void update(ReceiveTEntity ReceiveTEntity) {
        interReceiveT.update(ReceiveTEntity);
    }

    @Override
    public void delete(ReceiveTEntity ReceiveTEntity) {
        interReceiveT.delete(ReceiveTEntity);
    }

    @Override
    public List<ReceiveTEntity> findAllReceiveT() {
        return interReceiveT.findAllReceiveT();
    }

    @Override
    public ProducerEntity findProducerById(int id) {
        return interProducer.findProducerById(id);
    }

    @Override
    public void save(ProducerEntity ProducerEntity) {
        interProducer.save(ProducerEntity);
    }

    @Override
    public void update(ProducerEntity ProducerEntity) {
        interProducer.update(ProducerEntity);
    }

    @Override
    public void delete(ProducerEntity ProducerEntity) {
        interProducer.delete(ProducerEntity);
    }

    @Override
    public CustomersEntity findCustomersById(int id) {
        return interCustomers.findCustomersById(id);
    }

    @Override
    public void save(CustomersEntity CustomersEntity) {
        interCustomers.save(CustomersEntity);
    }

    @Override
    public void update(CustomersEntity CustomersEntity) {
        interCustomers.update(CustomersEntity);
    }

    @Override
    public void delete(CustomersEntity CustomersEntity) {
        interCustomers.delete(CustomersEntity);
    }

    @Override
    public CustomersEntity findCustomersByLogin(String login) { return interCustomers.findCustomersByLogin(login); }

    @Override
    public void save(OrdersEntity OrdersEntity) {
        interOrders.save(OrdersEntity);
    }

    @Override
    public void update(OrdersEntity OrdersEntity) {
        interOrders.update(OrdersEntity);
    }

    @Override
    public void delete(OrdersEntity OrdersEntity) {
        interOrders.delete(OrdersEntity);
    }

    @Override
    public List<OrdersEntity> findAllOrders() {
        return interOrders.findAllOrders();
    }

    @Override
    public List<OrdersEntity> findOrdersByTotalOrder(int id) { return interOrders.findOrdersByTotalOrder(id); }



    @Override
    public List<ProducerEntity> findAllProducer() {
        return interProducer.findAllProducer();
    }

    @Override
    public List<CustomersEntity> findAllCustomers() {
        return interCustomers.findAllCustomers();
    }

    public GoodsEntity findGoodById(int id) {
        return interGoods.findGoodById(id);
    }

    @Override
    public void save(GoodsEntity GoodsEntity) {
        interGoods.save(GoodsEntity);
    }

    @Override
    public void update(GoodsEntity GoodsEntity) {
        interGoods.update(GoodsEntity);
    }

    @Override
    public void delete(GoodsEntity GoodsEntity) {
        interGoods.delete(GoodsEntity);
    }

    @Override
    public List<GoodsEntity> findAllGoods() {
        return interGoods.findAllGoods();
    }

    @Override
    public List<GoodsEntity> findGoodsByProducer(String producerEntity) {
        return interGoods.findGoodsByProducer(producerEntity);
    }

    @Override
    public List<GoodsEntity> findGoodsByType(String producerEntity) {
        return interGoods.findGoodsByType(producerEntity);
    }


    @Override
    public CharacteristicsEntity findByTypeId(int type_id) {
        return DAO.findByTypeId(type_id);
    }

    @Override
    public void save(CharacteristicsEntity CharacteristicsEntity) {
        DAO.save(CharacteristicsEntity);
    }

    @Override
    public void update(CharacteristicsEntity CharacteristicsEntity) {
        DAO.update(CharacteristicsEntity);
    }

    @Override
    public void delete(CharacteristicsEntity CharacteristicsEntity) {
        DAO.delete(CharacteristicsEntity);
    }

    @Override
    public List<CharacteristicsEntity> findAllCharacteristics() {
        return DAO.findAllCharacteristics();
    }

    @Override
    public GoodsEntity findCharacteristicByType(int type_id) {
        return DAO.findCharacteristicByType(type_id);
    }

    @Override
    public OrdersEntity findOrderById(int id) {
        return interOrders.findOrderById(id);
    }



    //-----------


}
