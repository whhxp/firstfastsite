//@charset "UTF-8"
package org.apachechina.fschatroom.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apachechina.fschatroom.domain.ChatUserList;
import org.apachechina.fschatroom.domain.Message;
import org.apachechina.fschatroom.domain.Messages;
import org.apachechina.fscore.api.UserManager;
import org.apachechina.fscore.domain.User;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class AddChat extends ActionSupport implements Action{

	//DI
	UserManager userManager;
	
	public String execute(){
		ChatUserList instance = ChatUserList.getInstance();
	
		
		HttpServletRequest request = ServletActionContext.getRequest();	
		
		User username=userManager.getCurrentUser();
		
		String author = username.getName();
		String context = request.getParameter("editor1");

		Message message = new Message(author, context);
		Messages.add(message);
		List messages = Messages.messages();
		
		request.setAttribute("messages", messages);		
		request.setAttribute("list",instance.getList());
		
		System.out.println(messages);
		return SUCCESS;
	}

	
	public UserManager getUserManager() {
		return userManager;
	}

	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}
	
	

}
