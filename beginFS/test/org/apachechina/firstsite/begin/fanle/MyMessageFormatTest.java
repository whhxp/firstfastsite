// @charset "UTF-8";
package org.apachechina.firstsite.begin.fanle;

import java.text.MessageFormat;

import junit.framework.TestCase;

public class MyMessageFormatTest extends TestCase {
	public void testMessageFormat_format_base() {
		String real = MyMessageFormat.format("我是{0},年龄{1},{0}", new Object[] {
				"倪森", 24 });
		assertEquals("我是倪森,年龄24,倪森", real);
	}

	public void testMessageFormat_format_other() {
		String real = MyMessageFormat.format("我是{0},年龄{1},{0}", new Object[] {
				"jinlei", 25 });
		assertEquals("我是jinlei,年龄25,jinlei", real);
	}
	
	public void testMessageFormat_format_other3() {
		String real = MyMessageFormat.format("我是{0},年龄{1},{2},{3}", new Object[] {
				"jinlei", 25 ,78,"test"});
		assertEquals("我是jinlei,年龄25,78,test", real);
	}
}