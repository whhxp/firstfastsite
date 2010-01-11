package org.apachechina.fsmessage.domain;

import java.util.Date;







public class Message {

	private Long id;
	private String message;//信息内容
	private String style;//类型
	private String title;//标题
	private String associate;//关联的人
	private Date date;//日期

	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Message() {

	}
	public Message(String message,String style,String title,String associate,Date date) 
	{
		this.message=message;
		this.style=style;
		this.title=title;
		this.associate=associate;
		this.date=date;
	
	}



	public String getMessage() {
		return message;
	}



	public void setMessage(String message) {
		this.message = message;
	}



	public String getStyle() {
		return style;
	}



	public void setStyle(String style) {
		this.style = style;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getAssociate() {
		return associate;
	}



	public void setAssociate(String associate) {
		this.associate = associate;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	




	public String toString() {
		return "MESSAGE [id=" + id + ", message=" +message + ", style=" + style
				+ ", title=" + title+ ", associate=" + associate +",date="+(""+date)+ "]";
	}

}