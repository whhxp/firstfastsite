//@charset "UTF-8";
package  org.apachechina.fsnote.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import org.apachechina.fsnote.dao.ArticleDao;

import com.opensymphony.xwork2.ActionSupport;
import org.apachechina.fsnote.domain.Article;
import com.opensymphony.xwork2.Action;
/**
 * @author Administrator
 * 
 */
public class ArticleList extends ActionSupport implements Action
{
	ArticleDao articledao;
	public String execute() throws Exception {
		System.out.println("test here");
		HttpServletRequest request = ServletActionContext.getRequest();
		
		List<Article> arrayList=articledao.getList();
		request.setAttribute("list",arrayList);
		
		return SUCCESS;	
		
	}
	public ArticleDao getArticleDao() {
		return articledao;
	}

	public void setArticleDao(ArticleDao articleDao) {
		this.articledao = articleDao;
	}
}
