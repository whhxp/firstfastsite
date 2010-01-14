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
public class UserManagerRandomUser implements UserManager {	
	


	/* 
	 * 目前为随机得到用户
	 * @see org.apachechina.fscore.api.UserManager#getCurrentUser()
	 */
	public User getCurrentUser(){
		List<User> examples=User.examles();		
		int index = new Random().nextInt(examples.size());		
		return examples.get(index);	
	}
	

	
}
