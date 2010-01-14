//@charset "UTF-8";
package org.apachechina.fsnote.dao;

import java.util.List;

import org.apachechina.fsnote.domain.Note;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * @author Administrator
 * 
 */
public class NoteDao extends HibernateDaoSupport {
	public List<Note> getList() {
		return getHibernateTemplate().find("from Article");

	}
}
