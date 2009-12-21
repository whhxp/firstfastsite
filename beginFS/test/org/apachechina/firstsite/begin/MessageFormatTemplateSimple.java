package org.apachechina.firstsite.begin;


import junit.framework.TestCase;

/**
 * 所有测试的模板
 * @author nisen.cn@gmail.com
 *
 */
public  class MessageFormatTemplateSimple extends MessageFormatTemplate{
	

	public void assertFormat(String except, String pattern, Object[] args) {
		String real=org.apachechina.firstsite.begin.gaoxin.MyMessageFormat.format(pattern, args);
		
		assertEquals(except, real);
	}

	
}
