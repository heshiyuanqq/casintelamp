package com.cas.intelamp.dao;

import com.cas.intelamp.model.Poles;

public interface PolesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Poles record);

    int insertSelective(Poles record);

    Poles selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Poles record);

    int updateByPrimaryKey(Poles record);
}