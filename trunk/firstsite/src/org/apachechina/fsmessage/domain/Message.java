package org.apachechina.fsmessage.domain;

import java.util.ArrayList;







public class Message 
{
	int id;//存在数据库中的ID
	String name;//姓名
	ArrayList oldmessage;//阅读过的的信息
	int oldmessages;//阅读过的信息的总数
	String email;//邮件
	boolean isnew;//是否有新的信息
	ArrayList newmessage;//新的信息
	int newmessages;//新的信息的总数
	
	public String toString()
	{
		return "Message[id=" + id + ", name=" + name + ", email=" + email+"]";
	}
	public Message(int id,String name,String email)
	{
		this.id=id;
		this.name=name;
		this.email=email;
	}
	
	
	public boolean isIsnew() {
		return isnew;
	}


	public void setIsnew(boolean isnew) {
		this.isnew = isnew;
	}


	public ArrayList getNewmessage() {
		return newmessage;
	}


	public void setNewmessage(ArrayList newmessage) {
		this.newmessage = newmessage;
	}


	public int getNewmessages() {
		return newmessages;
	}


	public void setNewmessages(int newmessages) {
		this.newmessages = newmessages;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList getOldmessage() {
		return oldmessage;
	}
	public void setOldmessage(ArrayList oldmessage) {
		this.oldmessage = oldmessage;
	}
	public int getOldmessages() {
		return oldmessages;
	}
	public void setOldmessages(int oldmessages) {
		this.oldmessages = oldmessages;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	

}
