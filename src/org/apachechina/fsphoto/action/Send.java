package org.apachechina.fsphoto.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apachechina.fsphoto.dao.PhoDao;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class Send extends ActionSupport implements Action {

	PhoDao phoDao;

	public String execute() {
		HttpServletRequest request = ServletActionContext.getRequest();
		String str=request.getParameter("id");
		long in = Long.parseLong(str);
		
		return SUCCESS;
	}

	public PhoDao getPhoDao() {
		return phoDao;
	}

	public void setPhoDao(PhoDao phoDao) {
		this.phoDao = phoDao;
	}
}
