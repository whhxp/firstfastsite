package org.apachechina.fsphoto.domain;

public class Pho {
	Long id;
	String album;// 相册
	String description;// 描述

	public Pho() {
	}

	public Pho(String album, String description) {
		this.album = album;
		this.description = description;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	static public Pho example() {
		return new Pho("测试", "标题");
	}

	public String toString() {
		return "Pho[album " + album + ", description=" + description + "]";
	}

}
