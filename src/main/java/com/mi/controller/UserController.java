package com.mi.controller;

import com.mi.entity.ReqUser;
import com.mi.entity.RespCode;
import com.mi.entity.RespEntity;
import com.mi.entity.UserInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

/**
 * @Author 张东旭
 * @Description
 * @Date 2018.6.28 20:46
 * @Modified
 */
@RestController
@RequestMapping("/user")
public class UserController {

	private static Logger log =  LoggerFactory.getLogger(MessageController.class);

	@RequestMapping("/login")
	public RespEntity validate_logon(@RequestBody @Valid ReqUser reqUser){

		UserInfo userInfo = new UserInfo();
		if(reqUser != null) {
			userInfo.setIdentifier(reqUser.getIdentifier());
			userInfo.setCredential(reqUser.getCredential());
		}else{
			log.info("user is null");
		}

	//1.校验验证码

	//2.根据登录方式（手机、邮箱、账号、微信、微博、QQ）选择不同的处理方式
		return new RespEntity(RespCode.SUCCESS, userInfo);
	}

	@RequestMapping("/register")
	public RespEntity  user_register(@RequestBody  UserInfo user){

		//1.接受数据

		//2.密码加密

		//3.数据分类存储

		return null;
	}
}




