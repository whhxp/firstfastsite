//@charset "UTF-8";
package org.apachechina.fsboard.domain;

public class Board {
	Long id;
	String title;
	String context;
	String author;
	
	
	public Board(Long id,String title, String context, String author) {
		this(title,context,author);
		this.id=id;
	}
	
	public Board(String title, String context, String author) {
		this.title = title;
		this.context = context;
		this.author = author;
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

	
	/**
	 * 返回例子
	 * @return
	 */
	static public Board getExample(){
		Board board=new Board("网站不错", "非常的支持", "sensen");
		return board;	
	}
	
	
}
