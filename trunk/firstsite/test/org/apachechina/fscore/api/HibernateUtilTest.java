package org.apachechina.fscore.api;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;



public class HibernateUtilTest
{
	static Log log = LogFactory.getLog(HibernateUtilTest.class);
	public static void main(String[] args)
    {
	    try
        {
	    	Session session=HibernateUtil.beginTransaction();
	        
	        

	        HibernateUtil.commitTransaction();
        }
        catch (Exception e)        
        {	
        	HibernateUtil.rollbackTransaction();
        	log.warn("发生错误,回滚", e); 
        }
	   
    }
}
