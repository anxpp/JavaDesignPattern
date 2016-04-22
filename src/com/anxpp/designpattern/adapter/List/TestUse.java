package com.anxpp.designpattern.adapter.List;

import java.util.Iterator;
public class TestUse {
	public static void main(String args[]){
		BookAdapter books = new BookAdapter();
		books.add("think in java");
		books.add("c++ primer");
		books.add("伊索寓言");
		Iterator<String> iterator = books.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
}