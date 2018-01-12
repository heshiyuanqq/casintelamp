package com.cas.intelamp.dao;

import com.cas.intelamp.model.LGroup;

public interface LGroupMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LGroup record);

    int insertSelective(LGroup record);

    LGroup selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LGroup record);

    int updateByPrimaryKey(LGroup record);
}