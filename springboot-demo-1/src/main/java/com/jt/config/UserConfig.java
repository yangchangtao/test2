package com.jt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jt.pojo.User;

@Configuration	//表示配置类
public class UserConfig {
	
	private Integer id;
	private String username;
	
	//spring通过配置类实例化对象
	
	@Bean	
	public User user() {
		
		return new User(id, username);
	}

}
