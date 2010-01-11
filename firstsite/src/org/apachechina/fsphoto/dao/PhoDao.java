package org.apachechina.fsphoto.dao;

import java.util.List;

import org.apachechina.fsphoto.domain.Pho;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class PhoDao extends HibernateDaoSupport {
	public List<Pho> getList() {
		return getHibernateTemplate().find("from Pho");	
	}
}
