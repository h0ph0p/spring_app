package com.levelp.spring.service;

import com.levelp.spring.Entity.CharacteristicsEntity;
import com.levelp.spring.Entity.GoodsEntity;

import java.util.List;

public interface CharactService {

    CharacteristicsEntity findByTypeId(int type_id);
    void save(CharacteristicsEntity CharacteristicsEntity);
    void update(CharacteristicsEntity CharacteristicsEntity);
    void delete(CharacteristicsEntity CharacteristicsEntity);
    List<CharacteristicsEntity> findAll();
    GoodsEntity findCharacteristicByType(int type_id);

}
