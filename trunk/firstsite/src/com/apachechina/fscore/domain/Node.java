package com.apachechina.fscore.domain;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;


/**
 * @author nisen.cn@gmail.com
 * 
 */
public class Node  implements Map{
	
	
	
	


	//基本信息
	String id;  //标示，正在考虑和name是否合并
	String name;
	String fullName;
	String description;
	String order;
	
	//信息
	Map<String, Object> info=new HashMap<String, Object>() ; //一些信息
	Object detail;  //详细情况
	
	//关系
	List<Node> childs=new Vector<Node>();

	
	public Node(String name) {
		this.name = name;
	}
	
	
	public Node(String id, String name, String fullName, String description,
			String order) {
		super();
		this.id = id;
		this.name = name;
		this.fullName = fullName;
		this.description = description;
		this.order = order;
	}
	
	
	public void addChild(Node node)
	{
		//todo:如果出现循环树应当排除，出现排序的情况重新排序
		childs.add(node);
	}
	
	
	
	
	@Override
	public String toString() {
		return "Node [id=" + id + ", name=" + name + ", description="
				+ description + ", fullName=" + fullName + ", order=" + order
				+ "]\n"+
				tabToString();
	}
	

	/**
	 * @return
	 */
	private String tabToString() {
		StringBuffer buf=new StringBuffer();
		for (Node subNode : childs) {
			String[] splits = subNode.toString().split("\n");
			for (String split : splits) {
				buf.append("\t"+split+"\n");
			}
		}
		return buf.toString();
	}




	public void clear() {
		info.clear();
	}

	public boolean containsKey(Object key) {
		return info.containsKey(key);
	}

	public boolean containsValue(Object value) {
		return info.containsValue(value);
	}

	public Set entrySet() {
		return info.entrySet();
	}

	public boolean equals(Object o) {
		return info.equals(o);
	}

	public Object get(Object key) {
		return info.get(key);
	}

	public int hashCode() {
		return info.hashCode();
	}

	public boolean isEmpty() {
		return info.isEmpty();
	}

	public Set keySet() {
		return info.keySet();
	}

	public Object put(Object key, Object value) {
		return info.put((String) key, value);
	}

	public void putAll(Map t) {
		info.putAll(t);
	}

	public Object remove(Object key) {
		return info.remove(key);
	}

	public int size() {
		return info.size();
	}

	public Collection values() {
		return info.values();
	}


	
	
	
	
}
