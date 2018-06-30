package com.mi.controller;

/**
 * @Author 张东旭
 * @Description
 * @Date 2018.6.12 22:53
 * @Modified
 */

import com.mi.model.User_login;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/test")
public class TestController {

	private static Logger log =  LoggerFactory.getLogger(MessageController.class);

	@RequestMapping(value="/ok",method= RequestMethod.POST)
	public User_login test(){
		User_login user_login = new User_login(1,10000,"zh","123","456",19216);
		user_login.setIp(1);
		return user_login;
	}


}
