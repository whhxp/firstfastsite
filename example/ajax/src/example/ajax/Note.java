//@charset "UTF-8";
package example.ajax;

import java.util.Random;

public class Note {
	String title; //����
	int upNum; //��
	int downNum; //��
	
	//����
	private static Note instance = null;

	public static synchronized Note getInstance() {
		if (instance == null)
		{
			instance = new Note();
			instance.setTitle("������ô");
		}
		return instance;
	}
	
	/**
	 * ��
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
	 * ������ɲ�����20��Br
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
