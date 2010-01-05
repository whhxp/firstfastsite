package org.apachechina.fsboard.manager;

import java.util.ArrayList;
import java.util.List;

import org.apachechina.fsboard.domain.Board;

/**
 * 
 * @author nisen.cn@gmail.com
 */
public class BoardManager {

	
	//单例
	private static BoardManager instance = null;

	public static synchronized BoardManager getInstance() {
		if (instance == null)
			instance = new BoardManager();
		return instance;
	}

	public List<Board> getAllList() {

		List<Board> list = new ArrayList<Board>();

		list.add(new Board("澳门回归,举国欢庆", "距报道", "nisen"));
		list.add(new Board("澳门回归,举国欢庆", "距报道", "nisen"));

		return list;

	}

}
