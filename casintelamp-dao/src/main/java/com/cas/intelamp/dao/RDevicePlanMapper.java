package com.cas.intelamp.dao;

import com.cas.intelamp.model.RDevicePlan;

public interface RDevicePlanMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RDevicePlan record);

    int insertSelective(RDevicePlan record);

    RDevicePlan selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RDevicePlan record);

    int updateByPrimaryKey(RDevicePlan record);
}