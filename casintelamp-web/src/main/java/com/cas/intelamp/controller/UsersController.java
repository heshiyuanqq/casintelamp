package com.cas.intelamp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cas.intelamp.model.Users;
import com.cas.intelamp.service.impl.UsersService;
import com.cas.intelamp.vo.Result;

@Controller
public class UsersController extends BaseController{
	
		@Autowired
		private UsersService usersService;
	
		@RequestMapping(value="/demo/userListDemo",method=RequestMethod.GET)
		@ResponseBody
		public Result comDangerList(HttpServletRequest req){
				List<Users> userList=usersService.userListDemo();
				Result r = new Result();
				r.setCode(200);
				r.setData(userList);
				System.out.println("1111111111111");
				return r;
		}

}
