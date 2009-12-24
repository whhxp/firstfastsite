//@charset "UTF-8";
package example.ajax;

import java.util.Random;

public class Note {
	String title; //提名
	int upNum; //顶
	int downNum; //踩
	
	//单例
	private static Note instance = null;

	public static synchronized Note getInstance() {
		if (instance == null)
		{
			instance = new Note();
			instance.setTitle("你自恋么");
		}
		return instance;
	}
	
	/**
	 * 顶
	 * @return 
	 */
	public void up()
	{
		upNum++;
	}
	public void  down()
	{
		downNum++;
	}
	

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getUpNum() {
		return upNum;
	}

	public void setUpNum(int upNum) {
		this.upNum = upNum;
	}

	public int getDownNum() {
		return downNum;
	}

	public void setDownNum(int downNum) {
		this.downNum = downNum;
	}
	
	public static void main(String[] args) {
		String result = randomBr();
		
		System.out.println(result);
	}

	/**
	 * 随机生成不少于20个Br
	 * @return
	 */
	public static String randomBr() {
		String result="";
		for (int i = 0; i < new Random().nextInt(20); i++) {
			result+="<br />";
		}
		return result;
	}
	
	
}
