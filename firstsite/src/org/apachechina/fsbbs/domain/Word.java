package org.apachechina.fsbbs.domain;

import java.util.Date;

public class Word {
	Long id;
	String zuozhe;
	String gut;
	int liuyanid;
	Date date;

	public Word() {
	}

	public Word(String gut, int liuyanid, Date date) {
		this.gut = gut;
		this.liuyanid = liuyanid;
		this.date = date;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getZuozhe() {
		return zuozhe;
	}

	public void setZuozhe(String zuozhe) {
		this.zuozhe = zuozhe;
	}

	public String getGut() {
		return gut;
	}

	public void setGut(String gut) {
		this.gut = gut;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getLiuyanid() {
		return liuyanid;
	}

	public void setLiuyanid(int liuyanid) {
		this.liuyanid = liuyanid;
	}

	@Override
	public String toString() {
		return "Word [date=" + date + ", gut=" + gut + ", id=" + id
				+ ", liuyanid=" + liuyanid + ", zuozhe=" + zuozhe + "]";
	}

}
