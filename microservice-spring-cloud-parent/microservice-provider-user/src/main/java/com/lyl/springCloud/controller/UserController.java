/* 
* Copyright (C) 版权所有 2016-2026北京蛙鸣华清环保科技有限公司 
* All Rights Reserved 
* Description: TODO What the class does.   
* 
* @project 系统管理
* @author  yulongliu
* @date    2017年2月16日-下午10:36:42
*
* Modification History: 
**********************************************************
* Date		  Author		    Comments
* 2017年2月16日	  yulongliu			Create
**********************************************************
*/
package com.lyl.springCloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.EurekaClient;
import com.lyl.springCloud.entity.User;
import com.lyl.springCloud.repository.UserRepository;

/**
 * TODO What the class does
 * 
 * @author yulongliu
 * @date 2017年2月16日-下午10:36:42
 *
 */
@RestController
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private EurekaClient eurekaClient;

	@Autowired
	private DiscoveryClient discoveryClient;

	@GetMapping("/eureka-instance")
	public String serviceUrl() {
		InstanceInfo instance = eurekaClient.getNextServerFromEureka("MICROSERVICE-PROVIDER-USER", false);
		return instance.getHomePageUrl();
	}

	@GetMapping("/eureka-info")
	public ServiceInstance showInfo() {
		return this.discoveryClient.getLocalServiceInstance();
	}

	@GetMapping("/simple/{id}")
	private User findById(@PathVariable Long id) {
		return userRepository.findOne(id);
	}

}
