//@charset "UTF-8"
package org.apachechina.fsboard.dao;


import java.io.Serializable;

import org.apachechina.fsboard.domain.Board;
import org.apachechina.fsboard.manager.BoardManager;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.apachechina.fscore.api.*;

import junit.framework.TestCase;

public class BoardDaoTest extends TestCase {

	
	BoardDao boardDao;
	BeanFactory factory;
	BoardManager boardManager;
	
	protected void setUp() throws Exception {
		/*Spring支持*/
		factory=new ClassPathXmlApplicationContext("applicationContext*.xml");
		boardDao=(BoardDao) factory.getBean("boardDao");
		boardManager=(BoardManager) factory.getBean("boardManager");
	}

	public void testGetList() {
		
		
	}

	public void testSave() {
		SessionFactory sf=(SessionFactory) factory.getBean("sessionFactory");
		sf.getCurrentSession().beginTransaction();
		boardDao.save(Board.getExample());
		sf.getCurrentSession().getTransaction().commit();
	}
	
	/**
	 * 测试了HBM.xml的正确性
	 */
	public void testNoEnv() {
		HibernateUtil.beginTransaction();
		Board example = Board.getExample();
		HibernateUtil.currentSession().save(example);
		HibernateUtil.currentSession().delete(example);
		HibernateUtil.commitTransaction();
	}
	
	

}
