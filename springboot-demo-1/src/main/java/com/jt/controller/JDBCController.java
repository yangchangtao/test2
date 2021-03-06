package com.jt.controller;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ConfigurationProperties(prefix = "jdbc")
public class JDBCController {
	private String url;
	private String username;
	
	/**
	 * 利用该方式赋值时,必须调用属性的set方法
	 */
	
	@RequestMapping("/getMsg")
	public String getMsg() {
		
		return "获取数据:"+url+":"+username;
	}
	
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
}
