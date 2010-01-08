package org.apachechina.fscms.domain;



public class CMS {

	private Long id;
	private String title; // 文章标题
	private String title_jian; // 文章简要标题
	private String gut;// 文章的内容
	private String date;// 发表时间
	private String picture; //图片
	
	public CMS(){}
	public CMS(String title,String title_jian,String gut,String date,String picture){
		this.title=title;
		this.title_jian=title_jian;
		this.gut=gut;
		this.date=date;
		this.picture=picture;
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
	public String getTitle_jian() {
		return title_jian;
	}
	public void setTitle_jian(String titleJian) {
		title_jian = titleJian;
	}
	public String getGut() {
		return gut;
	}
	public void setGut(String gut) {
		this.gut = gut;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	
}
