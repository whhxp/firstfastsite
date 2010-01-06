package org.apachechina.fsphoto.domain;

import java.util.List;
import java.util.Vector;
import org.apachechina.fsphoto.domain.htool.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.classic.Session;

public class Hibernatepho {

	public static List getpho() {
		List list = new Vector();

		Session session = HibernateUtil.getSessionFactory().getCurrentSession();

		try {
			session.beginTransaction();
			Query query = session.createQuery("from Pho");

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
