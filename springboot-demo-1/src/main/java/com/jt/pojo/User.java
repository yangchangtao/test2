package com.jt.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data //set/get/toString/equals等
@NoArgsConstructor	//无参构造
@AllArgsConstructor	//全参构造
@Accessors(chain = true)	//链式加载 重写set方法
public class User {
	
	private Integer id;
	private String username;
	
	/*
	 * public User setId(Integer id) {
	 * 
	 * this.id = id; return this; }
	 */
	
	
	
	
	
	
	
	
	
}
