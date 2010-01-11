package org.apachechina.fsphoto.domain;

public class Pho {
	Long id;
	String album;// 相册名称
	String description;// 相册描述
	int count;//照片数量

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

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public String toString() {
		return "Pho[album " + album + ", description=" + description
				+ ",count=" + count + "]";
	}

}
