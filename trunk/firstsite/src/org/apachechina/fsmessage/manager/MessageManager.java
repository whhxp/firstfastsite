package org.apachechina.fsmessage.manager;

import java.util.List;

import org.apachechina.fsmessage.dao.UserMessageDao;
import org.apachechina.fsmessage.domain.Hibernatemessage;
import org.apachechina.fsmessage.domain.Message;

import org.apachechina.fsmessage.domain.UserMessage;



/**
 * 
 * @author jinlei.hb@gmail.com
 */
public class MessageManager {

	

	Hibernatemessage hm;
	UserMessageDao userMessageDao;

	public UserMessageDao getUserMessageDao() {
		return userMessageDao;
	}
	public void setUserMessageDao(UserMessageDao userMessageDao) {
		this.userMessageDao = userMessageDao;
	}
	public List<Message> getMESSAGEList() {


		return Hibernatemessage.getmessage();


	}
	public List<UserMessage> getMESSAGEUSERList() {


		return Hibernatemessage.getusermessage();


	}
	public Hibernatemessage getHm() {
		return hm;
	}
	public void setHm(Hibernatemessage hm) {
		this.hm = hm;
	}
	public UserMessage getFormmessage(String name) 
	{
		return userMessageDao.selectUM(name);
	}
	

	
	

}
