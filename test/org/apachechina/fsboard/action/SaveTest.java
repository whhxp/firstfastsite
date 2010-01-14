//@charset "UTF-8"
package org.apachechina.fsboard.action;

import org.apachechina.fsboard.dao.BoardDao;
import org.apachechina.fsboard.manager.BoardManager;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import junit.framework.TestCase;

public class SaveTest extends TestCase {

	
	Action save;
	BeanFactory factory;
	BoardManager boardManager;
	
	protected void setUp() throws Exception {
		/*Spring支持*/
		factory=new ClassPathXmlApplicationContext("applicationContext*.xml");
		save=(Action) factory.getBean("boardSave");
	}
	
	public void testExecute() throws Throwable  {
		save.execute();
	}

}
