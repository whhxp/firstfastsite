//@charset "UTF-8"
package org.apachechina.fscms.domain;

public class Article {
	long id;
	String title;
	
	public Article(){}
	
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
	
	
}
