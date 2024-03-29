package org.apachechina.fsmessage.domain;

import java.util.List;
import java.util.Vector;
import org.hibernate.Query;
import org.apache.log4j.spi.ThrowableInformation;
import org.apachechina.fscore.api.HibernateUtil;

import org.hibernate.classic.Session;

public class Hibernatemessage {

	public static List getmessage() {
		List list = new Vector();

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		try {
			session.beginTransaction();
			Query query = session.createQuery("from Message");

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
	public static List getusermessage() {
		List list = new Vector();

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		try {
			session.beginTransaction();
			Query query = session.createQuery("from UserMessage");

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
