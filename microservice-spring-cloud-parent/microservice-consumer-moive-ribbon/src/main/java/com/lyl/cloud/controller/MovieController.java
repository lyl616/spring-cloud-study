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
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
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

	@Autowired
	private LoadBalancerClient loadBalancerClient;

	@GetMapping("/test")
	public String test() {
		ServiceInstance serviceInstance1 = this.loadBalancerClient.choose("microservice-provider-user");
		ServiceInstance serviceInstance2 = this.loadBalancerClient.choose("microservice-provider-user2");
		System.out.println(serviceInstance1.getHost() + "\t" + serviceInstance1.getServiceId() + "\t" + serviceInstance1.getPort());
		System.err.println(serviceInstance2.getHost() + "\t" + serviceInstance2.getServiceId() + "\t" + serviceInstance2.getPort());
		return "1";
	}

	@GetMapping("/movie/{id}")
	public User findUserById(@PathVariable Long id) {
		return this.restTemplate.getForObject("http://microservice-provider-user2/simple/" + id, User.class);
	}

}
