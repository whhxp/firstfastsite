package org.apachechina.fsphoto.domain;

public class Pho {
	Long id;
	String album;// 相册
	String describe;// 描述

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public String toString() {
		return "Pho[album " + album + ", describe=" + describe + "]";
	}

}
