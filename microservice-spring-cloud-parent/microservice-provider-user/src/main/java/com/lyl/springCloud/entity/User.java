/* 
* Copyright (C) 版权所有 2016-2026北京蛙鸣华清环保科技有限公司 
* All Rights Reserved 
* Description: TODO What the class does.   
* 
* @project 系统管理
* @author  yulongliu
* @date    2017年2月16日-下午10:11:09
*
* Modification History: 
**********************************************************
* Date		  Author		    Comments
* 2017年2月16日	  yulongliu			Create
**********************************************************
*/
package com.lyl.springCloud.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * TODO What the class does
 * 
 * @author yulongliu
 * @date 2017年2月16日-下午10:11:09
 *
 */
@SuppressWarnings("all")
@Entity
public class User implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column
	private String username;
	@Column
	private String name;
	@Column
	private short age;
	@Column
	private BigDecimal balance;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public short getAge() {
		return age;
	}

	public void setAge(short age) {
		this.age = age;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

}
