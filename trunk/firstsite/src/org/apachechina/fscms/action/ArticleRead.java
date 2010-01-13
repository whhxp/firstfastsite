//@charset "UTF-8"
package org.apachechina.fscms.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apachechina.fscms.dao.ArticleDao;
import org.apachechina.fscms.domain.Article;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class ArticleRead extends ActionSupport implements Action{

	ArticleDao articleDao;
	
	
	public String execute() throws Exception {
		System.out.println(this.getClass()+"execute()");
		HttpServletRequest request = ServletActionContext.getRequest();		
		

		
	    String id=request.getParameter("id");
	    
	    
	    Article item=articleDao.get(Long.parseLong(id));
		
	    request.setAttribute("item",item);
	    request.setAttribute("id",id);
		
		return SUCCESS;	
		
	}

	public ArticleDao getArticleDao() {
		return articleDao;
	}

	public void setArticleDao(ArticleDao articleDao) {
		this.articleDao = articleDao;
	}
	
	
	
	

}
