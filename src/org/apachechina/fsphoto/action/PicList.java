package org.apachechina.fsphoto.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import org.apachechina.fsphoto.config.Config;
import org.apachechina.fsphoto.dao.PicDao;
import org.apachechina.fsphoto.domain.Pic;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class PicList extends ActionSupport implements Action {

	PicDao picDao;

	public String execute() throws Exception {
		System.out.println("test pic here");
		HttpServletRequest request = ServletActionContext.getRequest();

		List<Pic> arrayList = picDao.getpic();
		request.setAttribute("list", arrayList);
		return SUCCESS;

	}

	public PicDao getPicDao() {
		return picDao;
	}

	public void setPicDao(PicDao picDao) {
		this.picDao = picDao;
	}

	

}
