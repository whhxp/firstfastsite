package org.apachechina.fsbbs.domain;

public class Word {
	Long id;
	String zuozhe;
	String gut;
	int liuyanid;

	public Word() {
	}

	public Word(String zuozhe, String gut, int liuyanid) {
		this.zuozhe = zuozhe;
		this.gut = gut;
		this.liuyanid = liuyanid;
	}

	public String getZuozhe() {
		return zuozhe;
	}

	public void setZuozhe(String zuozhe) {
		this.zuozhe = zuozhe;
	}

	public String getGut() {
		return gut;
	}

	public void setGut(String gut) {
		this.gut = gut;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getLiuyanid() {
		return liuyanid;
	}

	public void setLiuyanid(int liuyanid) {
		this.liuyanid = liuyanid;
	}

	@Override
	public String toString() {
		return "Word [gut=" + gut + ", liuyan=" + liuyanid + ", zuozhe="
				+ zuozhe + "]";
	}

}
