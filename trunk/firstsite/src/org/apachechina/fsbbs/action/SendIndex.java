//@charsit "UTF-8"
package org.apachechina.fsbbs.action;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.ServletActionContext;
import org.apachechina.fsbbs.dao.BBSDao;
import org.apachechina.fsbbs.domain.BBS;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class SendIndex extends ActionSupport implements Action {

	static Log log = LogFactory.getLog(okIndex.class);
	BBSDao bbsDao;

	public String execute() {
		log.debug("okindex");
		
		HttpServletRequest request = ServletActionContext.getRequest();
		String str = request.getParameter("id");
		long in = Long.parseLong(str);
		BBS bbs = bbsDao.getOne(in);

		request.setAttribute("bbs", bbs);

		return SUCCESS;
	}

	public BBSDao getBbsDao() {
		return bbsDao;
	}

	public void setBbsDao(BBSDao bbsDao) {
		this.bbsDao = bbsDao;
	}

}