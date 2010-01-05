//@charset "UTF-8";
package org.apachechina.fsboard.action;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apachechina.fsboard.dao.BoardDao;
import org.apachechina.fsboard.domain.Board;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class Save extends ActionSupport implements Action{

	
	static Log log = LogFactory.getLog(Save.class);
	
	BoardDao boardDao;
	Board board;
	
	public String execute(){
		
		log.debug("execute()");

		
		boardDao.save(Board.getExample());
		
		return SUCCESS;
	}

	



	public BoardDao getBoardDao() {
		return boardDao;
	}


	public void setBoardDao(BoardDao boardDao) {
		this.boardDao = boardDao;
	}

	
	
	
	
	
	
	

}
