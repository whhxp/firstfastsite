package testjdkapi;

import java.text.MessageFormat;

import junit.framework.TestCase;

public class MessageFormatTest extends TestCase{
	public void testMessageFormat_format()
	{
		String real=MessageFormat.format("����{0},����{1}", new Object[]{"��ɭ",24});
		assertEquals("������ɭ,����24", real);
	}
	
	public void testString_format()
	{
		String real=String.format("����%s,����%s","��ɭ",24);
		assertEquals("������ɭ,����24", real);
	}
	
	
	
}
