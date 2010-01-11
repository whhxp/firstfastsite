//@charset "UTF-8"
package org.apachechina.fscore.dao;

import org.apachechina.fscore.domain.User;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class UserDao extends HibernateDaoSupport{
	
	//单例
	private static UserDao instance = null;

	public static synchronized UserDao getInstance() {
		if (instance == null)
			instance = new UserDao();
		return instance;
	}


	public User getUserByCookieid(String userCookieid) {
		return null;
	}

	public User getUserByName(String name) {
		return null;
	}


	public void updateCookieid(String name, String userCookieid) {
		// TODO Auto-generated method stub
		
	}

}
