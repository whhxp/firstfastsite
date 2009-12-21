//@charset "UTF-8"; 
package testjdkapi;

import java.text.MessageFormat;

import junit.framework.TestCase;

public class MessageFormatTest extends TestCase{
	public void testMessageFormat_format()
	{
		String real=MessageFormat.format("我是{0},年龄{1}", new Object[]{"倪森",24});
		assertEquals("我是倪森,年龄24", real);
	}
	
	public void testMessageFormat_formatTwoPara()
	{
		String real=MessageFormat.format("我是{0},年龄{1}, sign by {0}", new Object[]{"倪森",24});
		assertEquals("我是倪森,年龄24, sign by 倪森", real);
	}
	

	
	
}
