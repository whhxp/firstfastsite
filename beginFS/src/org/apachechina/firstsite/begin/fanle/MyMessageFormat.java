//@charset "UTF-8";
package org.apachechina.firstsite.begin.fanle;

public class MyMessageFormat {
	public static String format(String pattern, Object[] args) {
		String sub[]=new String[pattern.length()];
		String back="";
		for (int i = 0; i < pattern.length(); i++) {
			sub[i]=pattern.substring(i, i + 1);
		}
		for (int i = 0; i < sub.length; i++) {
			if(sub[i].equals("0"))
			{
				back+=args[0];
			}
			else if(sub[i].equals("1"))
			{
				back+=args[1];
			}
			else if(sub[i].equals("2"))
			{
				back+=args[2];
			}
			else if(sub[i].equals("{")||sub[i].equals("}"))
			{
				back+="";
			}
			else 
			{
				back+=sub[i];
			}

		}
		return back;
	}
}
