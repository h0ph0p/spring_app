package com.levelp.spring.DAO;

import com.levelp.spring.Entity.*;

import java.util.List;


public interface interReceiveT {

    ReceiveTEntity findById(int id);
    void save(ReceiveTEntity ReceiveTEntity);
    void update(ReceiveTEntity ReceiveTEntity);
    void delete(ReceiveTEntity ReceiveTEntity);
    List<ReceiveTEntity> findAll();

}
