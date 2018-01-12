package com.cas.intelamp.dao;

import com.cas.intelamp.model.LGroupPoles;

public interface LGroupPolesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LGroupPoles record);

    int insertSelective(LGroupPoles record);

    LGroupPoles selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LGroupPoles record);

    int updateByPrimaryKey(LGroupPoles record);
}