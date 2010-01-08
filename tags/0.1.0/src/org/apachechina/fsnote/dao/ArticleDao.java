//@charset "UTF-8";
package org.apachechina.fsnote.dao;

import java.util.List;

import org.apachechina.fscms.domain.Article;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * @author Administrator
 * 
 */
public class ArticleDao extends HibernateDaoSupport {
	public List<Article> getList() {
		return getHibernateTemplate().find("from Article");

	}
}
