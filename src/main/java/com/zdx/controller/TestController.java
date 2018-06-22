package com.zdx.controller;

/**
 * @Author 张东旭
 * @Description
 * @Date 2018.6.12 22:53
 * @Modified
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

	@RequestMapping(value="/test",method= RequestMethod.GET)
	public String test(){
		return "bbbccc";
	}

}
