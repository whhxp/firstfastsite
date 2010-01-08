//@charset "UTF-8";
package org.apachechina.fsboard.action;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.ServletActionContext;
import org.apachechina.fsboard.dao.BoardDao;
import org.apachechina.fsboard.domain.Board;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.inject.Context;

public class Save extends ActionSupport implements Action{

	
	static Log log = LogFactory.getLog(Save.class);
	
	BoardDao boardDao;
	
	String title;
	String context;
	
	
	public String execute(){
		ActionContext ac=ActionContext.getContext();
		
		HttpServletRequest request = ServletActionContext.getRequest();
		
		log.debug("execute()1");


		title = (String)request.getParameter("title");
		context = (String)request.getParameter("context");
		Board board=new Board(title, context, "me");
		
		System.out.println(board);
		boardDao.save(board);
		
		return SUCCESS;
	}

	public BoardDao getBoardDao() {
		return boardDao;
	}

	public void setBoardDao(BoardDao boardDao) {
		this.boardDao = boardDao;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContext() {
		return context;
	}

	public void setContext(String context) {
		this.context = context;
	}


	







	
	
	
	
	
	
	
	

}
