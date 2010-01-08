//@charset "UTF-8"
package org.apachechina.fsboard.manager;

import org.apachechina.fsboard.dao.BoardDao;
import org.apachechina.fsboard.domain.Board;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import junit.framework.TestCase;

public class BoardManagerTest extends TestCase {
	BoardDao boardDao;
	BeanFactory factory;
	BoardManager boardManager;
	
	protected void setUp() throws Exception {
		/*Spring支持*/
		factory=new ClassPathXmlApplicationContext("applicationContext*.xml");
		boardDao=(BoardDao) factory.getBean("boardDao");
		boardManager=(BoardManager) factory.getBean("boardManager");
	}
	
	public void testManage(){
		boardManager.save(Board.getExample());		
	}
}
