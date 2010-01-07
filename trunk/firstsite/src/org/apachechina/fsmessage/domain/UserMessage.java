package org.apachechina.fsmessage.domain;

public class UserMessage {
	private Long id;
	private int newnum;//新信息总数
	private int oldnum;//旧信息总数
	private int sumnum;//所有信息总数
	private int savenum;//草稿箱信息总数
	public UserMessage()
	{
		
	}
	public UserMessage(int newnum,int oldnum,int sumnum,int savenum)
	{
		this.newnum=newnum;
		this.oldnum=oldnum;
		this.sumnum=sumnum;
		this.savenum=savenum;
	}
	public String toString()
	{
		return "UserMessage [id=" + id + ", newnum=" +newnum + ", oldnum=" + oldnum
		+", sumnum="+sumnum+", savenum="+savenum+"]";
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
	public int getSumnum() {
		return sumnum;
	}
	public void setSumnum(int sumnum) {
		this.sumnum = sumnum;
	}
	public int getSavenum() {
		return savenum;
	}
	public void setSavenum(int savenum) {
		this.savenum = savenum;
	}
}