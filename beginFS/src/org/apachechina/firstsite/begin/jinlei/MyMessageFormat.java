package org.apachechina.firstsite.begin.jinlei;

public class MyMessageFormat {
	public static String format(String pattern,Object[] args)
	{
		int x=0;//���������Ƿ��������ģ�0�����ߣ�1��
		int dou=0;//��pattern�õ����ŵ��ַ���INT
		String begin="";//��pattern�õ�����ǰ�����ݴ�
		String end="";//��pattern�õ����źͶ��ź�����ݴ�
		for(int i=0;i<pattern.length();i++)//�õ�begin��ֵ
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
		for(int i=0;i<pattern.length();i++)//�õ�end��ֵ
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
		return begin+args[0]+end+args[1];//�õ����Ľ��
		
	}
	public static void main(String[] args) {
		
		System.out.println(MyMessageFormat.format("����{0},����{1}", new Object[]{"����",24}));
	}
}
