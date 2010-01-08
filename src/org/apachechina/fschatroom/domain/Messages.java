package org.apachechina.fschatroom.domain;

import java.util.List;
import java.util.Vector;

public class Messages {
	//单例
	private static Messages instance = null;

	public static synchronized Messages getInstance() {
		if (instance == null)
			instance = new Messages();
		return instance;
	}
	
	static List<Message> messages=new Vector<Message>();
	
	public static void add(Message message)
	{
		//todo: 如果空间
		messages.add(message);
	}
	
	public  static List messages()
	{		
		return messages;
	}
	
	
	
}
