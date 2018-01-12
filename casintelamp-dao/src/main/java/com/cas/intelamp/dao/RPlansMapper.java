package com.cas.intelamp.dao;

import com.cas.intelamp.model.RPlans;

public interface RPlansMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RPlans record);

    int insertSelective(RPlans record);

    RPlans selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RPlans record);

    int updateByPrimaryKey(RPlans record);
}