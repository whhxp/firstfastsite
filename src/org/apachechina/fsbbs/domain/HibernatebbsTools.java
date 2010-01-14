package org.apachechina.fsbbs.domain;

import java.util.List;
import java.util.Vector;
import org.hibernate.Query;
import org.apache.log4j.spi.ThrowableInformation;
import org.apachechina.fsbbs.domain.htool.HibernateUtil;
import org.hibernate.classic.Session;

/**
 * @deprecated 
 */
public class HibernatebbsTools {

	// 查询出bbs所有的内容
	public static List getbbs() {
		List list = new Vector();

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		try {
			session.beginTransaction();
			Query query = session.createQuery("from BBS");

			list = query.list();

			session.getTransaction().commit();
		} catch (Throwable e) {
			e.printStackTrace();
			session.getTransaction().rollback();

		} finally {
			if (session.isOpen()) {
				session.close();
			}
		}
		return list;
	}

	// 在数据库插入一个BBS
	public static void addbbs(BBS bbs) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		try {
			session.beginTransaction();

			session.save(bbs);
			session.getTransaction().commit();
		} catch (Throwable e) {
			e.printStackTrace();
			session.getTransaction().rollback();

		} finally {
			if (session.isOpen()) {
				session.close();
			}
		}
	}

	// 得到数据库一条内容
	public static BBS getOne(long id) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		BBS bbs = null;
		try {
			session.beginTransaction();
			bbs = (BBS) session.get(BBS.class, id);

			session.getTransaction().commit();
		} catch (Throwable e) {
			e.printStackTrace();
			session.getTransaction().rollback();

		} finally {
			if (session.isOpen()) {
				session.close();
			}
		}
		return bbs;
	}
	// 查询出留言表所有的内容
	public static List getword() {
		List list = new Vector();

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		try {
			session.beginTransaction();
			Query query = session.createQuery("from Word");

			list = query.list();

			session.getTransaction().commit();
		} catch (Throwable e) {
			e.printStackTrace();
			session.getTransaction().rollback();

		} finally {
			if (session.isOpen()) {
				session.close();
			}
		}
		return list;
	}
}
