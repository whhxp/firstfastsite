package org.apachechina.fsphoto.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.ServletActionContext;
import org.apachechina.fsphoto.dao.Phodao;
import org.apachechina.fsphoto.domain.Pho;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

public class PhoList extends ActionSupport implements Action {
	public Phodao getPhodao() {
		return phodao;
	}

	public void setPhodao(Phodao phodao) {
		this.phodao = phodao;
	}

	Phodao phodao;

	public String execute() throws Exception {
		System.out.println("test here");
		HttpServletRequest request = ServletActionContext.getRequest();

		List<Pho> arrayList = phodao.getList();
		request.setAttribute("list", arrayList);

		return SUCCESS;

	}
}
