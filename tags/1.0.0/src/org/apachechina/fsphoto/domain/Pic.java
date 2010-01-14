package org.apachechina.fsphoto.domain;

public class Pic {
	Long id;
	String route;// 照片路径
	String title;// 照片名字
	String Picdescrip;// 照片描述
	int count;// 照片数量

	public Pic() {
	}

	public Pic(String title, String Picdescrip) {
		this.title = title;
		this.Picdescrip = Picdescrip;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPicdescrip() {
		return Picdescrip;
	}

	public void setPicdescrip(String picdescrip) {
		Picdescrip = picdescrip;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String toString() {
		return "Pic [route=" + route + ",title=" + title + ",Picdescrip="
				+ Picdescrip + ",count=" + count + "]";
	}

}
