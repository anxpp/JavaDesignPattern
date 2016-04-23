package com.anxpp.designpattern.abstractfactory.iterator;
import java.util.Iterator;
import java.util.Map;
//具体产品，Map迭代器(用到了代理模式)
public class IteratorMap<T> implements IIterator<T>{
	Iterator<Map.Entry<T, Object>> iterator;
	public IteratorMap(Map<T,Object> m){
		iterator = m.entrySet().iterator();
	}
	@Override
	public boolean hasNext() {
		return iterator.hasNext();
	}
	@Override
	public Object next() {
		return iterator.next().getValue();
	}
}