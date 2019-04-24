package com.levelp.spring.service;

import com.levelp.spring.DAO.interCharact;
import com.levelp.spring.Entity.CharacteristicsEntity;
import com.levelp.spring.Entity.GoodsEntity;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CharactServImpl implements CharactService {

    @Autowired
    interCharact DAO;

    public CharacteristicsEntity findByTypeId(int type_id) {
        return DAO.findByTypeId(type_id);
    }

    public void save(CharacteristicsEntity CharacteristicsEntity) {
        DAO.save(CharacteristicsEntity);
    }

    public void update(CharacteristicsEntity CharacteristicsEntity) {
        DAO.update(CharacteristicsEntity);
    }

    public void delete(CharacteristicsEntity CharacteristicsEntity) {
        DAO.delete(CharacteristicsEntity);
    }

    public List<CharacteristicsEntity> findAll() {
        return DAO.findAll();
    }

    public GoodsEntity findCharacteristicByType(int type_id) {
        return DAO.findCharacteristicByType(type_id);
    }
}
