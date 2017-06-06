/* 
* Copyright (C) 版权所有 2016-2026北京蛙鸣华清环保科技有限公司 
* All Rights Reserved 
* Description: TODO What the class does.   
* 
* @project 系统管理
* @author  yulongliu
* @date    2017年2月20日-下午7:58:59
*
* Modification History: 
**********************************************************
* Date		  Author		    Comments
* 2017年2月20日	  yulongliu			Create
**********************************************************
*/
package com.lyl.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * TODO What the class does
 * 
 * @author yulongliu
 * @date 2017年2月20日-下午7:58:59
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {
	public static void main(String[] args) {
		SpringApplication.run(EurekaApplication.class, args);
	}
}
