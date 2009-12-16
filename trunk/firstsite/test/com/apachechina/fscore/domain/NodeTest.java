package com.apachechina.fscore.domain;

import junit.framework.TestCase;

public class NodeTest extends TestCase {

	public void testToString() {
		
	}

	
	public void testToString2() {
		
		Node hebei=new Node("河北");
			Node sjz = new Node("石家庄");
			Node handan = new Node("邯郸");
		hebei.addChild(sjz);
		hebei.addChild(handan);
		
		sjz.addChild(new Node("藁城"));
		sjz.addChild(new Node("辛集"));
		handan.addChild(new Node("邯郸县"));
		
		System.out.println(hebei);
	}
}
