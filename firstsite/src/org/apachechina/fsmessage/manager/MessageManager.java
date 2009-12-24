package org.apachechina.fsmessage.manager;



import java.util.ArrayList;
import java.util.List;


import org.apachechina.fsmessage.domain.Message;





/**
 * 
 * @author jinlei.hb@gmail.com
 */
public class MessageManager {
	private static MessageManager instance = null;

	public static synchronized MessageManager getInstance() {
		if (instance == null)
			instance = new MessageManager();
		return instance;
	}

	public List<Message> getAllList() {

		List<Message> list = new ArrayList<Message>();

		list.add(new Message(1,"靳磊","jinlei@shuaige.com"));
		list.add(new Message(2,"高鑫","gaoxin@shuaige.com"));

		return list;

	}


	

}
