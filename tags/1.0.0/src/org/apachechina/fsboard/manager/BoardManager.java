package org.apachechina.fsboard.manager;

import java.util.ArrayList;
import java.util.List;

import org.apachechina.fsboard.dao.BoardDao;
import org.apachechina.fsboard.domain.Board;

/**
 * 
 * @author nisen.cn@gmail.com
 */
public class BoardManager {

	

	BoardDao boardDao;

	public List<Board> getAllList() {


		return boardDao.getList();


	}
	
	public Board save(Board board) {
		boardDao.save(board);
		return board;
	}

	public BoardDao getBoardDao() {
		return boardDao;
	}

	public void setBoardDao(BoardDao boardDao) {
		this.boardDao = boardDao;
	}
	
	

}
