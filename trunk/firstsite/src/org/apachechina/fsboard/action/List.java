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

	public String execute() throws Exception {
		
		System.out.println("test here");
		HttpServletRequest request = ServletActionContext.getRequest();
		
		/*Spring支持*/
		BeanFactory factory = (BeanFactory) WebApplicationContextUtils
		.getRequiredWebApplicationContext(request.getSession()
				.getServletContext());
		BoardManager boardManager=(BoardManager)factory.getBean("boardManager");
		UserManager userManger=(UserManager)factory.getBean("userManager");
		 
		//
		request.setAttribute("currentUser",userManger.getCurrentUser());
		request.setAttribute("list",boardManager.getAllList());
		
		return SUCCESS;
	}

}
