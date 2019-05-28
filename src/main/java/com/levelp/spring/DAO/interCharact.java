package com.levelp.spring.DAO;

import com.levelp.spring.Entity.CharacteristicsEntity;
import com.levelp.spring.Entity.GoodsEntity;

import java.util.List;

public interface interCharact {

    CharacteristicsEntity findByTypeId(int type_id);
    void save(CharacteristicsEntity CharacteristicsEntity);
    void update(CharacteristicsEntity CharacteristicsEntity);
    void delete(CharacteristicsEntity CharacteristicsEntity);
    List<CharacteristicsEntity> findAllCharacteristics();
    GoodsEntity findCharacteristicByType(int type_id);

}
