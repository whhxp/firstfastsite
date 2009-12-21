package study.jdk15;

import junit.framework.TestCase;

public class String_format extends TestCase {
	
	public void testString_format()
	{
		String real=String.format("我是%s,年龄%s","倪森",24);
		assertEquals("我是倪森,年龄24", real);
	}
	
}
