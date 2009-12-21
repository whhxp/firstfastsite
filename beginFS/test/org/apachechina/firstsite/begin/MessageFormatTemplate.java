package org.apachechina.firstsite.begin;


import junit.framework.TestCase;

/**
 * 所有测试的模板
 * @author nisen.cn@gmail.com
 *
 */
public abstract class MessageFormatTemplate extends TestCase{
	

	
	public void testMessageFormat_format_other()
	{
		String pattern = "我是{0},年龄{1}";
		Object[] args = new Object[]{"jinlei",25};
		String except = "我是jinlei,年龄25";
		
		assertFormat(except, pattern, args);

	}


	public abstract void  assertFormat(String except, String pattern, Object[] args);
	

	
}
