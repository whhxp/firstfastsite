package com.tool;

import java.util.List;
import java.util.Vector;

/**
 * 分页得到的结果
 * @author niit
 *
 */
public class PageResult
{
	
	
	public static final int   DEFALUT_ELEMENT_NUM=5;
	private List list;  //当前页的内容
	private int pageNum;  //最大页数
	private int pageIndex;    //当前页,从0开始
	private int elementNum; //每页最大元素数
	private int size;      //总共有多少条数据
	
	public PageResult(List srcList,int elementNum,int page)
	{
		this.elementNum=elementNum;
		this.pageIndex=page;
		this.size=srcList.size();
		
		//计算最大页数
		pageNum=size/elementNum;
		if(size%elementNum!=0)
		{
			pageNum=pageNum+1;
		}
		
		if(pageNum==0)
		{
			this.pageIndex=0;
		}
		else if(page>pageNum-1)   //如果页数增大则返回最后一页
		{
			this.pageIndex=pageNum-1;
		}
		
		this.list=new Vector();		
		int begin=this.pageIndex*elementNum;
		int end=(this.pageIndex+1)*elementNum;
		if(end>size)
		{
			end=size;
		}
		
		for (int i = begin; i < end ; i++)
        {
	        Object obj=srcList.get(i);
	        list.add(obj);
        }
		
		
	}
	
	public PageResult(List srcList,int page)
	{
		this(srcList,DEFALUT_ELEMENT_NUM,page);
	}

	public int getElementNum()
    {
    	return elementNum;
    }

	public List getList()
    {
    	return list;
    }

	public int getPageIndex()
    {
    	return pageIndex;
    }

	public int getPageNum()
    {
    	return pageNum;
    }
	
	public int getSize()
    {
    	return size;
    }

	public String toString()
	{		
		return 	"最大页数："+pageNum+"当前页："+pageIndex
				+"每页最大元素数："+elementNum
				+"多少条数据："+size
			+"\n所有数据："+this.list;
	}
	
	
}
