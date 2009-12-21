//@charset "UTF-8";
package org.apachechina.firstsite.begin.xiaofei;

import junit.framework.TestCase;

public class MyMessageFormatTest extends TestCase {
	public void testMessageFormat_format_base() {
		String real = MyMessageFormat.format("我是{0},年龄{1}", new Object[] {
				"王龙飞", 21 });
		assertEquals("我是王龙飞,年龄21", real);
	}

	public void testMessageFormat_format_other() {
		String real = MyMessageFormat.format("我是{0},年龄{1}", new Object[] {
				" 王龙飞", 21 });
		assertEquals("我是 王龙飞,年龄21", real);
	}

}