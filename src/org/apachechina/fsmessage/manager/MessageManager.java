package org.apachechina.fsmessage.manager;

import java.util.List;

import org.apachechina.fsmessage.domain.Hibernatemessage;
import org.apachechina.fsmessage.domain.Message;

import org.apachechina.fsmessage.domain.UserMessage;



/**
 * 
 * @author jinlei.hb@gmail.com
 */
public class MessageManager {

	

	Hibernatemessage hm;

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
	

	
	

}
