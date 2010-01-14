//@charset "UTF-8";
package org.apachechina.fsmessage.action;



import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import org.apachechina.fscore.api.UserManager;
import org.apachechina.fscore.domain.User;
import org.apachechina.fsmessage.dao.MessageDao;
import org.apachechina.fsmessage.dao.UserMessageDao; 
import org.apachechina.fsmessage.domain.Message;
import org.apachechina.fsmessage.domain.UserMessage;
import org.apachechina.fsmessage.manager.MessageManager;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
public class Delete extends ActionSupport implements Action{

	
	
	UserManager userManager;
	MessageManager messageManager;


	public String execute(){
		
		HttpServletRequest request = ServletActionContext.getRequest();
		
		
		User u=userManager.getCurrentUser();
		String str[];
		str=request.getParameterValues("checkbox");
		if(str.length!=0)
		{
			UserMessage um=(UserMessage)messageManager.getFormmessage(userManager.getCurrentUser().getName());
			for(int i=0;i<str.length;i++)
			{
				messageManager.deleteMessage(str[i]);
				um.setNewnum(um.getNewnum()-1);
			}
			messageManager.upUserMessage(um);
		}
		return SUCCESS;
		
	}




	public UserManager getUserManager() {
		return userManager;
	}


	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}


	public MessageManager getMessageManager() {
		return messageManager;
	}


	public void setMessageManager(MessageManager messageManager) {
		this.messageManager = messageManager;
	}


	

}
