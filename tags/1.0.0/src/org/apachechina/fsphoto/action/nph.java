package org.apachechina.fsphoto.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apachechina.fsphoto.dao.PhoDao;
import org.apachechina.fsphoto.domain.Pho;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class nph extends ActionSupport implements Action {
	PhoDao phoDao;

	public String execute() {
		HttpServletRequest request = ServletActionContext.getRequest();
		String album = request.getParameter("album");
		String description = request.getParameter("description");
		Pho pho = new Pho(album, description);
		phoDao.save(pho);

		return SUCCESS;
	}

	public PhoDao getPhoDao() {
		return phoDao;
	}

	public void setPhoDao(PhoDao phoDao) {
		this.phoDao = phoDao;
	}

}
