//@charset "UTF-8";
package org.apachechina.fsboard.domain;

public class Board {
	String id;
	String title;
	String context;
	String author;
	
	
	
	public Board(String id, String title, String context, String author) {
		this.id = id;
		this.title = title;
		this.context = context;
		this.author = author;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Override
	public String toString() {
		return "Board [id=" + id + ", title=" + title + ", author=" + author
				+ ", context=" + context + "]";
	} 

	
	
	
}
