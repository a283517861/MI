package com.mi.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author 张东旭
 * @Description
 * @Date 2018.6.13 18:40
 * @Modified
 */
@Controller
public class MessageController {

	private static Logger log = LoggerFactory.getLogger(MessageController.class);

	@RequestMapping("/show")
	public String show(Model model) {
		model.addAttribute("url","www.baidu.com"); //request属性传递包装
		model.addAttribute("mid","111");

		return "message/message_show"; //此处指返回一个路径，该路径没有设置后缀，默认为*.html
	}

	@RequestMapping("/")
	public String index(){
		return "static/welcome/index";
	}
}