package org.apachechina.fsbbs.domain;

public class BBS {

	private Long id;
	private String title; //文章的标题
	private String gut;//文章的内容
	private int liuyan;//留言条数
	private int guankan;//观看次数

	public BBS() {
	}

	public BBS(String title, String gut) {
		this.title = title;
		this.gut = gut;
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
	public String toString() {
		return "BBS [id=" + id + ", guankan=" + guankan + ", gut=" + gut
				+ ", liuyan=" + liuyan + ", title=" + title + "]";
	}
}