package org.apachechina.fscore.api;

import org.apachechina.fscore.domain.User;



/**
 * 用户管理
 * @author nisen.cn@gmail.com
 */
public class UserManager {
	
	
	
	
	/**
	 * 得到当前用户
	 * @return
	 */
	public User getCurrentUser(){
		return new User("1","test");		
	}
	
}
