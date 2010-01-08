//@charset "UTF-8";
package org.apachechina.fscore.api;

import org.hibernate.*;
import org.hibernate.cfg.*;
import org.hibernate.classic.Session;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;


/**
 * 对Hibernate的封装
 * @author nisen.cn@gmail.com
 */
public class HibernateUtil {

	static Log log = LogFactory.getLog(HibernateUtil.class);
	
    private static final SessionFactory sessionFactory;

    static {
        try {
            // Create the SessionFactory from hibernate.cfg.xml
            sessionFactory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
        	log.fatal("不能连接数据库", ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
    
    
    
    /**
     * 得到当前Session
     */
    public static Session currentSession() {    	
    	return getSessionFactory().getCurrentSession();
    }

    /**
     * 关闭当前Session
     */
    public static void closeSession() {    	
    	Session session=getSessionFactory().getCurrentSession();
        if (session != null) {
            session.close();
        }
    }
    
    /**
     * 开始当前线程的事务
     * @return 
     */
    public static Session beginTransaction(){ 
    	Session session=getSessionFactory().getCurrentSession();
    	
    	Transaction tx=session.getTransaction();
    	if(!tx.isActive())
    	{
    		//System.out.println("-----------beginTransaction----------------------");
    		if(log.isDebugEnabled())
    		{
    			log.debug("--beginTransaction--");
    		}    		
    		session.beginTransaction(); 
    	}
    	return session;
    } 
 
    public static void commitTransaction(){
    	
        Session session = getSessionFactory().getCurrentSession();
		Transaction tx =session.getTransaction();
		try{
	        if (tx != null && tx.isActive() && !tx.wasCommitted() && !tx.wasRolledBack()) 
	        {
	        	//System.out.println("-----------commitTransaction----------------------");
	            tx.commit(); 
	        }
		}
        finally
        {
        	closeSession();
        }
    }
 
    /**
     * 
     */
    public static void rollbackTransaction() {
        try { 
        	Transaction tx =getSessionFactory().getCurrentSession().getTransaction();
            if (tx != null && tx.isActive() && !tx.wasCommitted() && !tx.wasRolledBack()) { 
               	tx.rollback(); 
            } 
        }
        catch (Throwable e) {
			log.error("回滚的时候发生异常", e);
		}
        finally 
        { 
            closeSession(); 
        } 
    } 

}