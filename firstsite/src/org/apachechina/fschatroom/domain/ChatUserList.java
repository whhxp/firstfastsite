//@charset "UTF-8";
package org.apachechina.fschatroom.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
	
	Set<User> chatUsers=new HashSet<User>();
	
	public Set<User> add(User user)
	{
		chatUsers.add(user);
		return chatUsers;
	}
	public Set<User> getList()
	{
		return chatUsers;		
	}
}
