package com.levelp.spring.DAO;

import com.levelp.spring.Entity.*;

import java.util.List;


public interface interReceiveT {

    ReceiveTEntity findReceiveTById(int id);
    void save(ReceiveTEntity ReceiveTEntity);
    void update(ReceiveTEntity ReceiveTEntity);
    void delete(ReceiveTEntity ReceiveTEntity);
    List<ReceiveTEntity> findAllReceiveT();

}
