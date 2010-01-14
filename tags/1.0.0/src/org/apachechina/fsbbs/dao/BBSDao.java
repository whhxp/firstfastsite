//@charset "UTF-8"
package org.apachechina.fsbbs.dao;

import java.util.List;

import org.apachechina.fsbbs.domain.BBS;
import org.apachechina.fsbbs.domain.Word;
import org.apachechina.fsboard.domain.Board;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class BBSDao extends HibernateDaoSupport {

	// 查询出bbs所有的内容
	public List<BBS> getList() {
		return getHibernateTemplate().find("from BBS");
	}

	// 在数据库插入一个BBS
	public void addbbs(BBS bbs) {
		getHibernateTemplate().save(bbs);
	}

	// 得到数据库一条内容
	public BBS getOne(long id) {
		BBS bbs = (BBS) getHibernateTemplate().get(BBS.class, id);
		return bbs;
	}

	
	
	// 查询出留言表所有的内容
	public List<Word> getword(int id) {
		return getHibernateTemplate().find("from Word where liuyanid="+id);
	}
	// 在数据库插入一个留言
	public void addword(Word word) {
		getHibernateTemplate().save(word);
	}
}
