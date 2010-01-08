//@charset "UTF-8"
package org.apachechina.fsboard.dao;

import java.util.List;

import org.apachechina.fsboard.domain.Board;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class BoardDao extends HibernateDaoSupport{
	
	public List<Board> getList(){
		
		return getHibernateTemplate().find("from Board");
		
		
	}
	
	public  void save(Board item)
	{	
		getHibernateTemplate().saveOrUpdate(item);
		System.out.println("-------BoardDAO.save()+ "+item+"---------------");
	}
}
