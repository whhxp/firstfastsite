package com.tool.test;

import java.util.List;
import java.util.Vector;

import com.bean.User;
import com.tool.PageResult;

public class PageTest
{
	public static void main(String[] args)
    {
		List list=new Vector();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add("6");
		list.add("7");
		list.add("8");
		list.add("9");
		list.add("10");
		list.add("11");
		list.add("12");
		list.add("13");
		list.add("14");
		list.add("15");
		
		
	    PageResult page=new PageResult(list,5,2);	    
	    System.out.println(page);
	    
	    System.out.println(new PageResult(list,4,3));
	    
	    System.out.println(new PageResult(list,4,5));
	    
	    list.clear();
	    System.out.println(new PageResult(list,4,3));
    }
}
