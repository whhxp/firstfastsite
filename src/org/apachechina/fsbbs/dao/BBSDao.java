//@charset "UTF-8"
package org.apachechina.fsbbs.dao;

import java.util.List;

import org.apachechina.fsbbs.domain.BBS;
import org.apachechina.fsboard.domain.Board;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class BBSDao extends HibernateDaoSupport{
	
	
	public List<BBS> getList(){
		
		return getHibernateTemplate().find("from BBS");		
		
	}
	
}
