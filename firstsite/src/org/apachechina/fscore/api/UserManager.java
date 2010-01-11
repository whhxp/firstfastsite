package org.apachechina.fscore.api;

import java.util.List;
import java.util.Random;
import java.util.Vector;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.components.Radio;
import org.apachechina.fscore.domain.User;

import com.util.SessionUtils;



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
		//todo : 目前为随机得到用户
//		List<User> examples=getExample();		
//		int index = new Random().nextInt(examples.size());		
//		return examples.get(index);	
		
		HttpServletRequest request = ServletActionContext.getRequest();	
		com.bean.User  user = SessionUtils.getUser(request);
		
		User currentUser = new User();
		currentUser.setName(user.getUserName());
		currentUser.setFullName(user.getNickname());
		
		return currentUser;
//		
//		Object obj=request.getSession().getAttribute(USER_NAME);
//		User user=(User)obj;
//		return user;
	}
	
	public List<User> getExample(){
		List<User> examples=new  Vector<User>();
		examples.add(new User("111"));
		examples.add(new User("nisen"));
		examples.add(new User("jinlei"));
		examples.add(new User("fanle"));
		examples.add(new User("tomcat"));
		examples.add(new User("Lily"));
		examples.add(new User("tat"));
		return examples;
		
	}
	
}
