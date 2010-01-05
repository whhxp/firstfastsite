//@charset "UTF-8"
package org.apachechina.fsboard.dao;

import org.apachechina.fsboard.domain.Board;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import junit.framework.TestCase;

public class BoardDaoTest extends TestCase {

	
	BoardDao boardDao;
	
	protected void setUp() throws Exception {
		/*Spring支持*/
		BeanFactory factory=new ClassPathXmlApplicationContext("applicationContext*.xml");
		boardDao=(BoardDao) factory.getBean("boardDao");
	}

	public void testGetList() {
		
	}

	public void testSave() {
		boardDao.save(Board.getExample());
	}

}
