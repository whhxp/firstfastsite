package org.apachechina.fscore.api;

import org.apachechina.fscore.domain.User;



/**
 * 用户管理
 * @author nisen.cn@gmail.com
 */
public class UserManager {
	
	
	//单例
	private static UserManager instance = null;

	public static synchronized UserManager getInstance() {
		if (instance == null)
			instance = new UserManager();
		return instance;
	}
	
	/**
	 * 得到当前用户
	 * @return
	 */
	public User getCurrentUser(){
		return new User("1","test");		
	}
	
}
