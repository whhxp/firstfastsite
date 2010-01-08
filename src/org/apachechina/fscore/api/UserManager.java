package org.apachechina.fscore.api;

import java.util.List;
import java.util.Random;
import java.util.Vector;

import org.apache.struts2.components.Radio;
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
		//todo : 目前为随机得到用户
		List<User> examples=getExample();		
		int index = new Random().nextInt(examples.size());		
		return examples.get(index);	
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
