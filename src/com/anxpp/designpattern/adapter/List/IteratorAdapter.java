package com.anxpp.designpattern.adapter.List;
import java.util.Enumeration;
import java.util.Iterator;
//适配器，目标就是Iterator，被适配者是Enumeration
public class IteratorAdapter implements Iterator<String> {
	Enumeration<String> myEnum;
	public IteratorAdapter(Enumeration<String> myEnum){
		this.myEnum = myEnum;
	}
	@Override
	public boolean hasNext() {
		return myEnum.hasMoreElements();
	}
	@Override
	public String next() {
		return myEnum.nextElement();
	}
}