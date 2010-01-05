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

		List<Board> list = new ArrayList<Board>();

		list.add(new Board("澳门回归,举国欢庆", "距报道", "nisen"));
		list.add(new Board("澳门回归,举国欢庆", "距报道", "nisen"));

		return list;

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
