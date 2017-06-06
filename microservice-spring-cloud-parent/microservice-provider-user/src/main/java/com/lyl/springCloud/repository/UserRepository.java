/* 
* Copyright (C) 版权所有 2016-2026北京蛙鸣华清环保科技有限公司 
* All Rights Reserved 
* Description: TODO What the class does.   
* 
* @project 系统管理
* @author  yulongliu
* @date    2017年2月16日-下午11:33:20
*
* Modification History: 
**********************************************************
* Date		  Author		    Comments
* 2017年2月16日	  yulongliu			Create
**********************************************************
*/
package com.lyl.springCloud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lyl.springCloud.entity.User;

/**
 * TODO What the class does
 * 
 * @author yulongliu
 * @date 2017年2月16日-下午11:33:20
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	
}
