package com.cas.intelamp.dao;

import com.cas.intelamp.model.RMedia;

public interface RMediaMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RMedia record);

    int insertSelective(RMedia record);

    RMedia selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RMedia record);

    int updateByPrimaryKey(RMedia record);
}