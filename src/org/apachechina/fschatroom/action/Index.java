//@charset "UTF-8"
package org.apachechina.fschatroom.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apachechina.fschatroom.domain.ChatUserList;
import org.apachechina.fscore.api.UserManager;
import org.apachechina.fscore.domain.User;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class Index extends ActionSupport implements Action{

	//DI
	UserManager userManager;
	
	public String execute(){
		ChatUserList instance = ChatUserList.getInstance();

		instance.add(userManager.getCurrentUser());		
		
		HttpServletRequest request = ServletActionContext.getRequest();	
		
	
		
		request.setAttribute("list",instance.getList());
		
		return SUCCESS;
	}

	
	public UserManager getUserManager() {
		return userManager;
	}

	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}
	
	

}
