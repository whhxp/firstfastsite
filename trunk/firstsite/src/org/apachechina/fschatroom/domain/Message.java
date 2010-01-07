package org.apachechina.fschatroom.domain;

import java.util.Date;

public class Message {
	String author;
	String context;
	
	public Message() {
	}

	public Message(String author, String context) {
		this.author = author;
		this.context = context;
		
	}

	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	
}
