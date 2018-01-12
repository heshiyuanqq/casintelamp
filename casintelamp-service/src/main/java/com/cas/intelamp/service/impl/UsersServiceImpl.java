package com.cas.intelamp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cas.intelamp.dao.UsersMapper;
import com.cas.intelamp.model.Users;

@Service
public class UsersServiceImpl implements UsersService{
	
	@Autowired
	private UsersMapper usersMapper;

	@Override
	public List<Users> userListDemo() {
		return usersMapper.userListDemo();
	}

}
