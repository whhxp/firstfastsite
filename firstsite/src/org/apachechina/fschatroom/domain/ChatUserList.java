//@charset "UTF-8";
package org.apachechina.fschatroom.domain;

import java.util.List;
import java.util.Vector;


import org.apachechina.fscore.domain.User;

/**
 * @author gaoxin2000@gmail.com
 * 
 */
public class ChatUserList {
	//单例
	private static ChatUserList instance = null;

	public static synchronized ChatUserList getInstance() {
		if (instance == null)
			instance = new ChatUserList();
		return instance;
	}
	
	List<User> chatUsers=new Vector<User>();

	public List<User> add(User user)
	{
	
	
		int size = chatUsers.size();
		for (int i = 0; i < size; i++) {
			User names=chatUsers.get(i);
			String name1=names.getName();
			
			String name=user.getName();
			
			if(name1.equals(name))
			{
				return chatUsers;
			}
				
		}
		chatUsers.add(user);
		return chatUsers;
	}
	public List<User> getList()
	{
		return chatUsers;		
	}
}
