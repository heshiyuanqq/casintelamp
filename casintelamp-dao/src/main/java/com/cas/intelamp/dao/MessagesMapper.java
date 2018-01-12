package com.cas.intelamp.dao;

import com.cas.intelamp.model.Messages;

public interface MessagesMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Messages record);

    int insertSelective(Messages record);

    Messages selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Messages record);

    int updateByPrimaryKey(Messages record);
}