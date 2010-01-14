package org.apachechina.fscore.manager;

import java.util.List;
import java.util.Random;
import java.util.Vector;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.components.Radio;
import org.apachechina.fscore.api.UserManager;
import org.apachechina.fscore.domain.User;

import com.util.SessionUtils;



/**
 * 用户管理
 * @author nisen.cn@gmail.com
 */
public class UserManagerImpl implements UserManager {	
	

	/* 
	 * 从session中得到当前用户
	 * @see org.apachechina.fscore.api.UserManager#getCurrentUser()
	 */
	public User getCurrentUser(){
		
		HttpServletRequest request = ServletActionContext.getRequest();	
		com.bean.User  user = SessionUtils.getUser(request);
		
		User currentUser = new User();
		currentUser.setName(user.getUserName());
		currentUser.setFullName(user.getNickname());
		
		return currentUser;
	}
	

	
}
