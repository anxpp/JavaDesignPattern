package com.anxpp.designpattern.abstractfactory.iterator;
import java.util.Collection;
import java.util.Iterator;
//具体产品，Collection迭代器(用到了代理模式)
public class IteratorCollection<T> implements IIterator<T>{
	Iterator<T> iterator;
	public IteratorCollection(Collection<T> c){
		iterator = c.iterator();
	}
	@Override
	public boolean hasNext() {
		return iterator.hasNext();
	}
	@Override
	public T next() {
		return iterator.next();
	}
}
