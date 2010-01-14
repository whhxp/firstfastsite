//@charset "UTF-8"
package org.apachechina.fscms.domain;

import java.util.List;
import java.util.Vector;

public class Article {
	long id;
	String title;// 文章标题
	private String subTitle; // 文章简要标题
	private String gut;// 文章的内容
	private String date;// 发表时间
	private String picture; //图片地址

	public Article() {
	}

	public Article(String title) {
		super();
		this.title = title;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	// *系统内置数据*//

	public String getSubTitle() {
		return subTitle;
	}

	public void setSubTitle(String titleJian) {
		subTitle = titleJian;
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

	/**
	 * @return 一条数据
	 */
	static public Article example() {
		return new Article("tata");
	}

	/**
	 * 多条数据
	 * @return
	 */
	static public List<Article> examples() {
		List<Article> list = new Vector<Article>();
		list.add(new Article("第一篇文章题目"));
		list.add(new Article("第二篇文章题目"));
		list.add(new Article("第三篇文章题目"));
		return list;
	}

}