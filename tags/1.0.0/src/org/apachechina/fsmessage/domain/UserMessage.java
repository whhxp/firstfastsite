package org.apachechina.fsmessage.domain;

public class UserMessage {
	private Long id;
	private String name;
	private int newnum;//未读信息总数
	private int oldnum;//已读信息总数
	private int savenum;//草稿箱信息总数
	public UserMessage()
	{
		
	}
	public UserMessage(String name)
	{
		this.name=name;
	}
	public String toString()
	{
		return "UserMessage [id=" + id + ", newnum=" +newnum + ", oldnum=" + oldnum
		+", savenum="+savenum+"]";
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getNewnum() {
		return newnum;
	}
	public void setNewnum(int newnum) {
		this.newnum = newnum;
	}
	public int getOldnum() {
		return oldnum;
	}
	public void setOldnum(int oldnum) {
		this.oldnum = oldnum;
	}

	public int getSavenum() {
		return savenum;
	}
	public void setSavenum(int savenum) {
		this.savenum = savenum;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
