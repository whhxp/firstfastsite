package study.jdk15.template;

import java.util.ArrayList;
import java.util.List;



/**
 * 如何使用模板
 * @author nisen.cn@gmail.com
 */
public class ListTest {
	
	public static void main(String[] args) {
		
		List<Board> list=new ArrayList<Board>();
		
		list.add(new Board("1","澳门回归,举国欢庆","距报道","nisen"));
		list.add(new Board("2","澳门回归,举国欢庆","距报道","nisen"));
		
		//list.add("stas"); error
		
		System.out.println(list);
	}
	
}

class Board {
	String id;
	String title;
	String context;
	String author;
	
	
	
	public Board(String id, String title, String context, String author) {
		this.id = id;
		this.title = title;
		this.context = context;
		this.author = author;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContext() {
		return context;
	}
	public void setContext(String context) {
		this.context = context;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Override
	public String toString() {
		return "Board [id=" + id + ", title=" + title + ", author=" + author
				+ ", context=" + context + "] \n";
	} 

	
	
	
}
