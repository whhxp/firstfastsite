package org.apachechina.fsnote;

import java.util.List;
import java.util.Vector;
import org.hibernate.Query;
import org.apache.log4j.spi.ThrowableInformation;
import org.apachechina.fsbbs.domain.htool.HibernateUtil;
import org.hibernate.classic.Session;

public class Hibernatenote {

	public static List getnote() {
		List list = new Vector();

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		try {
			session.beginTransaction();
			Query query = session.createQuery("from Note");

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
