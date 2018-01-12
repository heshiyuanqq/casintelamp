package com.cas.intelamp.dao;

import com.cas.intelamp.model.Streets;

public interface StreetsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Streets record);

    int insertSelective(Streets record);

    Streets selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Streets record);

    int updateByPrimaryKey(Streets record);
}