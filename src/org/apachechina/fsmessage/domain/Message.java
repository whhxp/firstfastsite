package org.apachechina.fsmessage.domain;

import java.util.Date;







public class Message {

	private Long id;
	private String message;//信息内容
	private String style;//类型
	private String title;//标题
	private String thefrom;//信息来自
	private String theto;//信息发到








	private Date date;//日期

	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Message() {

	}
	public Message(String message,String style,String title,String thefrom,String theto,Date date) 
	{
		this.message=message;
		this.style=style;
		this.title=title;
		this.thefrom=thefrom;
		this.theto=theto;
		this.date=date;
	
	}



	public String getThefrom() {
		return thefrom;
	}
	public void setThefrom(String thefrom) {
		this.thefrom = thefrom;
	}
	public String getTheto() {
		return theto;
	}
	public void setTheto(String theto) {
		this.theto = theto;
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



	


	


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	




	public String toString() {
		return "MESSAGE [id=" + id + ", message=" +message + ", style=" + style
				+ ", title=" + title+ ", form=" + thefrom +",date="+(""+date)+ "]";
	}

}