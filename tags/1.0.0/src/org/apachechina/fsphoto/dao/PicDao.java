package org.apachechina.fsphoto.dao;

import java.util.List;

import org.apachechina.fsphoto.domain.Pic;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class PicDao extends HibernateDaoSupport {
	public List<Pic> getpic() {
		return getHibernateTemplate().find("from Pic");
	}
}
