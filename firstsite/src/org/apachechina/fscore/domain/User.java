package org.apachechina.fscore.domain;

import java.util.List;
import java.util.Vector;


/**
 * 表示系统中的当前用户
 * @author nisen.cn@gmail.com
 */
public class User {
	
	String id;  
	String name; //用户名,必须是英文,因为可能用在URL中
	String fullName;//名称
	
	
	
	public User() {
	}
	
	
	public User(String name) {
		this.name=name;	
	}
	
	public User(String id, String name,String fullName) {
		this(id,name);
		this.fullName=fullName;
	}
	
	public User(String id, String name) {
		this.id=id;
		this.name=name;		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		id = id;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", fullName=" + fullName
				+ "]";
	}

	
	
	/* (non-Javadoc)
	 * @see org.apachechina.fscore.api.IUserManager#getExample()
	 */
	static public List<User> examles(){
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
