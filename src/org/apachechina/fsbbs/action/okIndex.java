//@charsit "UTF-8"
package org.apachechina.fsbbs.action;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.ServletActionContext;
import org.apachechina.fsbbs.dao.BBSDao;
import org.apachechina.fsbbs.domain.BBS;

public class okIndex extends ActionSupport implements Action {

	static Log log = LogFactory.getLog(okIndex.class);
	BBSDao bbsDao;

	public String execute() {
		log.debug("okindex");

		HttpServletRequest request = ServletActionContext.getRequest();
		String title = request.getParameter("title");
		String gut = request.getParameter("gut");
		Date date = new Date();
		BBS bbs = new BBS(title, gut, date);
		bbsDao.addbbs(bbs);

		return SUCCESS;
	}

	public BBSDao getBbsDao() {
		return bbsDao;
	}

	public void setBbsDao(BBSDao bbsDao) {
		this.bbsDao = bbsDao;
	}

}
