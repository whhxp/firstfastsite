package org.apachechina.fscore.domain;


/**
 * 表示系统中的当前用户
 * @author nisen.cn@gmail.com
 */
public class User {
	
	String id;
	String name;
	
	
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
	
	@Override
	public String toString() {
		return "User [Id=" + id + ", name=" + name + "]";
	}

	
	
	

}
