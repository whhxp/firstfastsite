package org.apachechina.fschatroom.domain;

import java.util.List;
import java.util.Vector;

import org.apachechina.fscore.domain.User;

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
		int size = messages.size();
	if(size>=14)
	{
		messages.remove(0);
	}
		messages.add(message);
	}
	
	public  static List messages()
	{		
		return messages;
	}
	
	
}
