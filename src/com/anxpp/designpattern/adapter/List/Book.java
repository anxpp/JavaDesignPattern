package com.anxpp.designpattern.adapter.List;

import java.util.Enumeration;
import java.util.Vector;
//被适配者
public class Book{
	private Vector<String> books;
	public Book(){
		books = new Vector<String>();
	}
	public void add(String book){
		books.add(book);
	}
	public Enumeration<String> getEnum(){
		return books.elements();
	}
}