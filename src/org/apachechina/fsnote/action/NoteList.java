//@charset "UTF-8";
package  org.apachechina.fsnote.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import org.apachechina.fsnote.dao.NoteDao;

import com.opensymphony.xwork2.ActionSupport;
import org.apachechina.fsnote.domain.Note;
import com.opensymphony.xwork2.Action;
/**
 * @author Administrator
 * 
 */
public class NoteList extends ActionSupport implements Action
{
	
 public String execute() throws Exception {
		System.out.println("test here");
		HttpServletRequest request = ServletActionContext.getRequest();		
		return SUCCESS;	
		
	}

}
