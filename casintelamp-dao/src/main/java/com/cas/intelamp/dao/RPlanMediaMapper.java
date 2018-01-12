package com.cas.intelamp.dao;

import com.cas.intelamp.model.RPlanMedia;

public interface RPlanMediaMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RPlanMedia record);

    int insertSelective(RPlanMedia record);

    RPlanMedia selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RPlanMedia record);

    int updateByPrimaryKey(RPlanMedia record);
}