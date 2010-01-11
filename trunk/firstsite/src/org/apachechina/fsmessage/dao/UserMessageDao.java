package org.apachechina.fsmessage.dao;

//@charset "UTF-8"


import java.util.List;


import org.apachechina.fsmessage.domain.UserMessage;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class UserMessageDao extends HibernateDaoSupport{
	
	public List<UserMessage> getList(){
		
		return getHibernateTemplate().find("from UserMessage");
		
		
	}
	
	public  void save(UserMessage item)
	{	
		getHibernateTemplate().saveOrUpdate(item);
		System.out.println("-------UserMessage()+ "+item+"---------------");
	}
	public boolean select(String name)
	{
		return getHibernateTemplate().find("from UserMessage where name='"+name+"'").isEmpty();
	}
	

}
