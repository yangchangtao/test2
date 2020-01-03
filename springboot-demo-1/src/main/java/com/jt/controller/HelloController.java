package com.jt.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jt.pojo.User;

//@Controller
//@ResponseBody
@RestController	//返回JSON数据
public class HelloController {
	
	/**
	 * 表达式语法: spel表达式类似于el表达式 ${key}
	 * 原理:从容器中动态获取名称为demo.name的值
	 * 为name属性赋值
	 */
	@Value("${demo.name}")
	private String name;
	@Value("${demo.age}")
	private Integer age;
	
	
	//字符串本身
	@RequestMapping("/hello")
	public String hello() {
	
		
		return "您好:"+name+":"+age;
	}
	
}
