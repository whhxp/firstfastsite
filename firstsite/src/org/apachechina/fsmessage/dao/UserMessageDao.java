package org.apachechina.fsmessage.dao;

//@charset "UTF-8"


import java.util.List;


import org.apachechina.fsmessage.domain.UserMessage;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class UserMessageDao extends HibernateDaoSupport{
	
	public List<UserMessage> getList(){
		
		return getHibernateTemplate().find("from UserMessage");
		
		
	}
	
	public  void save(UserMessage item)//保存对象到数据库
	{	
		getHibernateTemplate().saveOrUpdate(item);
		System.out.println("-------UserMessage()+ "+item+"---------------");
	}
	public boolean select(String name)//通过主表用户名查找message表对应的数据,查看该数据是否存在
	{
		return getHibernateTemplate().find("from UserMessage where name='"+name+"'").isEmpty();
	}
	public UserMessage selectUM(String name)
	{
		List list=getHibernateTemplate().find("from UserMessage where name='"+name+"'");
		UserMessage um=(UserMessage)list.get(0);
		return um;
	}
	public void update(UserMessage item)
	{
		getHibernateTemplate().update(item);
	}
	

}
