//@charset "UTF-8"
package org.apachechina.fscms.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.apachechina.fscms.dao.ArticleDao;
import org.apachechina.fscms.domain.Article;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class ArticleList extends ActionSupport implements Action{

	ArticleDao articleDao;
	
	public String execute() throws Exception {
		System.out.println("test here");
		HttpServletRequest request = ServletActionContext.getRequest();		
		

		
		List<Article> arrayList=articleDao.getList();
		request.setAttribute("list",arrayList);
		
		return SUCCESS;	
		
	}

	public ArticleDao getArticleDao() {
		return articleDao;
	}

	public void setArticleDao(ArticleDao articleDao) {
		this.articleDao = articleDao;
	}
	
	
	
	

}
