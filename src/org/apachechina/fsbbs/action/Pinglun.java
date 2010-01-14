//@charsit "UTF-8"
package org.apachechina.fsbbs.action;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.ServletActionContext;
import org.apachechina.fsbbs.dao.BBSDao;
import org.apachechina.fsbbs.domain.BBS;
import org.apachechina.fsbbs.domain.Word;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class Pinglun extends ActionSupport implements Action {

	static Log log = LogFactory.getLog(okIndex.class);
	BBSDao bbsDao;

	public String execute() {
		log.debug("Pinglun");

		HttpServletRequest request = ServletActionContext.getRequest();
		String str = request.getParameter("id");
		int in = Integer.parseInt(str);
		String pinglun = request.getParameter("pinglun");
		Date date = new Date();
		Word word = new Word(pinglun, in, date);
		bbsDao.addword(word);

		return SUCCESS;
	}

	public BBSDao getBbsDao() {
		return bbsDao;
	}

	public void setBbsDao(BBSDao bbsDao) {
		this.bbsDao = bbsDao;
	}

}