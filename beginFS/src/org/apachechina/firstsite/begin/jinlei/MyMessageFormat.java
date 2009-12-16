package org.apachechina.firstsite.begin.jinlei;

public class MyMessageFormat {
	public static String format(String pattern,Object[] args)
	{
		int x=0;//用来测试是否有连续的｛0｝或者｛1｝
		int dou=0;//从pattern得到逗号的字符串INT
		String begin="";//从pattern得到逗号前的形容词
		String end="";//从pattern得到逗号和逗号后的形容词
		for(int i=0;i<pattern.length();i++)//得到begin的值
		{
			char ch=pattern.charAt(i);
			String str=""+ch;
			if(str.equals("{"))
			{
				x=1;
				
			}
			else if(str.equals("0")&&x==1)
			{
				x=2;
			}
			else if(str.equals("}")&&x==2)
			{
				x=3;
				begin=pattern.substring(0, i-2);
				break;
			}
			else if(!str.endsWith("{")||!str.endsWith("0"))
			{
				x=0;
			}
		}
		for(int i=0;i<pattern.length();i++)//得到end的值
		{
			char ch=pattern.charAt(i);
			String str=""+ch;
			if(str.equals(","))
			{
				dou=i;
			}
			else if(str.equals("{"))
			{
				x=1;
				
			}
			else if(str.equals("1")&&x==1)
			{
				x=2;
			}
			else if(str.equals("}")&&x==2)
			{
				x=3;
				
				end=pattern.substring(dou, i-2);
				break;
			}
			else if(!str.endsWith("{")||!str.endsWith("0"))
			{
				x=0;
			}
		}
		return begin+args[0]+end+args[1];//得到最后的结果
		
	}
	public static void main(String[] args) {
		
		System.out.println(MyMessageFormat.format("我是{0},年龄{1}", new Object[]{"靳磊",24}));
	}
}
