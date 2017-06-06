/* 
* Copyright (C) 版权所有 2016-2026北京蛙鸣华清环保科技有限公司 
* All Rights Reserved 
* Description: TODO What the class does.   
* 
* @project 系统管理
* @author  yulongliu
* @date    2017年2月17日-下午10:40:34
*
* Modification History: 
**********************************************************
* Date		  Author		    Comments
* 2017年2月17日	  yulongliu			Create
**********************************************************
*/
package com.lyl.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.lyl.cloud.entity.User;


/**
 * TODO What the class does
 * 
 * @author yulongliu
 * @date 2017年2月17日-下午10:40:34
 *
 */
@RestController
public class MovieController {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("/moive/{id}")
	public User findUserById(@PathVariable Long id) {
		return this.restTemplate
				.getForObject("http://localhost:7900/simple/" + id, User.class);
	}

}
