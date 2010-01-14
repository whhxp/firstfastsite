package org.apachechina.fsphoto.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import org.apachechina.fsphoto.dao.PhoDao;
import org.apachechina.fsphoto.domain.Pho;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class PhoList extends ActionSupport implements Action {

	PhoDao phoDao;

	public String execute() throws Exception {
		System.out.println("test here");
		HttpServletRequest request = ServletActionContext.getRequest();

		List<Pho> arrayList = phoDao.getList();
		request.setAttribute("list", arrayList);

		return SUCCESS;

	}

	public PhoDao getPhoDao() {
		return phoDao;
	}

	public void setPhoDao(PhoDao phoDao) {
		this.phoDao = phoDao;
	}



	
}
