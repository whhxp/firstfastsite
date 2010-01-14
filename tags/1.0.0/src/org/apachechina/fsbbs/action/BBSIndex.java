//@charsit "UTF-8"
package org.apachechina.fsbbs.action;


import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import org.apachechina.fsbbs.dao.BBSDao;
import org.apachechina.fsbbs.domain.BBS;
import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class BBSIndex extends ActionSupport implements Action {

	static Log log = LogFactory.getLog(BBSIndex.class);

	BBSDao bbsDao;

	@Override
	public String execute() {
		log.debug("index");

		HttpServletRequest request = ServletActionContext.getRequest();

		List list = bbsDao.getList();

		request.setAttribute("list", list);

		return SUCCESS;
	}

//	public String getone() {
//
//		HttpServletRequest request = ServletActionContext.getRequest();
//		System.out.println("getone()");
//		String str = request.getParameter("id");
//		long in = Long.parseLong(str);
//		BBS bbs = bbsDao.getOne(in);
//
//		request.setAttribute("bbs", bbs);
//
//		return SUCCESS;
//	}

	public BBSDao getBbsDao() {
		return bbsDao;
	}

	public void setBbsDao(BBSDao bbsDao) {
		this.bbsDao = bbsDao;
	}

}
