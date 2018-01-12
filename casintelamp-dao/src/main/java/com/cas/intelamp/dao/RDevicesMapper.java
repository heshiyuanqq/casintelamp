package com.cas.intelamp.dao;

import com.cas.intelamp.model.RDevices;

public interface RDevicesMapper {
    int insert(RDevices record);

    int insertSelective(RDevices record);
}