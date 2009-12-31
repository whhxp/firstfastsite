//@charset "UTF-8";
package org.apachechina.fsboard.action;

import javax.servlet.http.HttpServletRequest;


import org.apache.struts2.ServletActionContext;
import org.apachechina.fsboard.manager.BoardManager;
import org.apachechina.fscore.api.UserManager;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.web.context.support.WebApplicationContextUtils;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class List extends ActionSupport implements Action{

	
	//DI
	BoardManager boardManager;
	UserManager userManager;
	
	public String execute() throws Exception {
		
		System.out.println("test here");
		HttpServletRequest request = ServletActionContext.getRequest();
		
		
		
		request.setAttribute("currentUser",userManager.getCurrentUser());
		request.setAttribute("list",boardManager.getAllList());
		
		return SUCCESS;
	}

	
	
	public BoardManager getBoardManager() {
		return boardManager;
	}

	public void setBoardManager(BoardManager boardManager) {
		this.boardManager = boardManager;
	}



	public UserManager getUserManager() {
		return userManager;
	}

 

	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}





	
	
	
	
	

}
