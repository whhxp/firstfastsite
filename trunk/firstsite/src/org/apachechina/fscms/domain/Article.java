//@charset "UTF-8"
package org.apachechina.fscms.domain;

import java.util.List;
import java.util.Vector;

public class Article {
	long id;
	String title;

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