package com.anxpp.designpattern.adapter.List;

import java.util.Iterator;
//适配器
public class BookAdapter extends Book implements Iterable<String>{
	@Override
	public Iterator<String> iterator() {
		return new IteratorAdapter(getEnum());
	}
}
