package org.apachechina.fsmessage.dao;

//@charset "UTF-8"


import java.util.List;


import org.apachechina.fsmessage.domain.Message;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class MessageDao extends HibernateDaoSupport{
	
	public List<Message> getList(){
		
		return getHibernateTemplate().find("from Message");
		
		
	}
	
	public  void save(Message item)
	{	
		getHibernateTemplate().saveOrUpdate(item);
		System.out.println("-------MessageDao.save()+ "+item+"---------------");
	}
	public  List<Message> select(String name)
	{
		return getHibernateTemplate().find("from Message where theto='"+name+"' and style='to'");
	}
	public void deleteMessage(String str)
	{
		long id = Long.parseLong(str);
		Message m=(Message)getHibernateTemplate().find("from Message where id='"+id+"'").get(0);
		getHibernateTemplate().delete(m);
		
	}

}
