package com.apachechina.fscore.domain;

import junit.framework.TestCase;

public class NodeTest extends TestCase {

	public void testToString() {
		
	}

	
	public void testToString2() {
		
		Node hebei=new Node("�ӱ�");
			Node sjz = new Node("ʯ��ׯ");
			Node handan = new Node("����");
		hebei.addChild(sjz);
		hebei.addChild(handan);
		
		sjz.addChild(new Node("޻��"));
		sjz.addChild(new Node("����"));
		handan.addChild(new Node("������"));
		
		System.out.println(hebei);
	}
}
