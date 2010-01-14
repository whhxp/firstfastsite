package org.apachechina.fsnote.domain;

import java.util.Date;
import java.util.List;
import java.util.Vector;

import org.apachechina.fscms.domain.Article;

public class Note {

	private Long id;
	private String title; // 文章的主题
	private String gut;// 文章的内容
	private Date date;// 发表时间

	public Note() {
	}

	public Note(String title, String gut, Date date) {
		this.title = title;
		this.gut = gut;
		this.date = date;
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
	
	// *系统内置数据*//

	/**
	 * @return 一条数据
	 */
	static public Note example() {
		return new Note("title","11111",new Date());
	}

	/**
	 * 多条数据
	 * @return
	 */
	static public List<Note> examples() {
		List<Note> list = new Vector<Note>();
		list.add(new Note("title","11111",new Date()));
		list.add(new Note("title2","22222",new Date()));
		list.add(new Note("title3","33333",new Date()));
		return list;
	}
}