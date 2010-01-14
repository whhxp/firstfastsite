//@charset "UTF-8";
package org.apachechina.fsmessage.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apachechina.fscore.api.UserManager;
import org.apachechina.fsmessage.dao.UserMessageDao;
import org.apachechina.fsmessage.domain.UserMessage;
import org.apachechina.fsmessage.manager.MessageManager;

import sun.security.krb5.internal.crypto.u;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class List extends ActionSupport implements Action{

	
	//DI
	MessageManager messageManager;
	UserMessageDao userMessageDao;
	public UserMessageDao getUserMessageDao() {
		return userMessageDao;
	}







	public void setUserMessageDao(UserMessageDao userMessageDao) {
		this.userMessageDao = userMessageDao;
	}







	public MessageManager getMessageManager() {
		return messageManager;
	}







	public void setMessageManager(MessageManager messageManager) {
		this.messageManager = messageManager;
	}



	UserManager userManager;
	
	public String execute(){
		
		System.out.println("test here");
		HttpServletRequest request = ServletActionContext.getRequest();
		if(userMessageDao.select(userManager.getCurrentUser().getName()))
		{
			UserMessage um=new UserMessage(userManager.getCurrentUser().getName());
			userMessageDao.save(um);
		}
		
		
		request.setAttribute("currentUser",userManager.getCurrentUser());
		request.setAttribute("list",messageManager.getMESSAGEList());
		request.setAttribute("list2",messageManager.getMESSAGEUSERList());
		request.setAttribute("from",messageManager.getFormmessage(userManager.getCurrentUser().getName()));
		request.setAttribute("listnew", messageManager.getMessageNewList(userManager.getCurrentUser().getName()));
		return SUCCESS;
	}

	
	
	



	public UserManager getUserManager() {
		return userManager;
	}

 

	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}





	
	
	
	
	

}
