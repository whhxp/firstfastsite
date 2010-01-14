//@charset "UTF-8";
package org.apachechina.fsmessage.action;



import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import org.apachechina.fscore.api.UserManager;
import org.apachechina.fscore.domain.User;
import org.apachechina.fsmessage.dao.MessageDao;
import org.apachechina.fsmessage.dao.UserMessageDao; 
import org.apachechina.fsmessage.domain.Message;
import org.apachechina.fsmessage.domain.UserMessage;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
public class Save extends ActionSupport implements Action{

	
	
	MessageDao messageDao;
	
	String title;
	String context;
	String addressee; 
	String sent;
	String ck;
	UserMessageDao userMessageDao;
	UserManager userManager;


	public String execute(){
		
		HttpServletRequest request = ServletActionContext.getRequest();
		
		addressee = (String)request.getParameter("addressee");
		title = (String)request.getParameter("title");
		context = (String)request.getParameter("context");
		ck=(String)request.getParameter("checkbox");
		User u=userManager.getCurrentUser();
		if(addressee.endsWith(u.getName()))
		{
			return "error";
		}
		if(userMessageDao.select(addressee))
		{
			return "error";
		}
		Date time=new Date();
		//保存信息
		if(ck!=null)
		{
			if("yes".endsWith(ck))
			{
				Message message2=new Message(context,"form",title,u.getName(),addressee,time);
				messageDao.save(message2);
			}
		}
		Message message=new Message(context,"to",title,u.getName(),addressee,time);
		messageDao.save(message);
		
		//新旧信息统计
		UserMessage umTo=userMessageDao.selectUM(addressee);
		umTo.setNewnum(umTo.getNewnum()+1);
	
	
		userMessageDao.update(umTo);
		return SUCCESS;
	}


	public MessageDao getMessageDao() {
		return messageDao;
	}


	public void setMessageDao(MessageDao messageDao) {
		this.messageDao = messageDao;
	}


	public String getAddressee() {
		return addressee;
	}


	public void setAddressee(String addressee) {
		this.addressee = addressee;
	}


	public String getSent() {
		return sent;
	}


	public void setSent(String sent) {
		this.sent = sent;
	}


	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}


	public UserMessageDao getUserMessageDao() {
		return userMessageDao;
	}


	public void setUserMessageDao(UserMessageDao userMessageDao) {
		this.userMessageDao = userMessageDao;
	}


	public UserManager getUserManager() {
		return userManager;
	}


	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}





	








	
	
	
	
	
	

}
