package org.apachechina.fsnote;

import java.util.Date;

public class Note {

	private Long id;
	private String title; // 文章的主题
	private String gut;// 文章的内容
	private Date date;// 发表时间

	public Note() {
	}

	public Note(String title, String gut, Date date) {
		this.title = title;
		this.gut = gut;
		this.date = date;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getGut() {
		return gut;
	}

	public void setGut(String gut) {
		this.gut = gut;
	}
}