package org.apachechina.fsbbs.domain;

import java.util.Date;

public class BBS {

	private Long id;
	private String title; //文章的主题
	private String gut;//文章的内容
	private int liuyan;//留言条数
	private int guankan;//观看次数
	private Date date;//发表时间

	public BBS() {
	}

	public BBS(String title, String gut) {
		this.title = title;
		this.gut = gut;
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

	public int getLiuyan() {
		return liuyan;
	}

	public void setLiuyan(int liuyan) {
		this.liuyan = liuyan;
	}

	public int getGuankan() {
		return guankan;
	}

	public void setGuankan(int guankan) {
		this.guankan = guankan;
	}
	@Override
	public String toString() {
		return "BBS [date=" + date + ", guankan=" + guankan + ", gut=" + gut
				+ ", id=" + id + ", liuyan=" + liuyan + ", title=" + title
				+ "]";
	}
}