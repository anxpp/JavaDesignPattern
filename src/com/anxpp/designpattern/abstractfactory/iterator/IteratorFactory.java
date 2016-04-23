package com.anxpp.designpattern.abstractfactory.iterator;
import java.util.Collection;
import java.util.Map;
//具体工厂
public class IteratorFactory<T> implements IIteratorFactory<T>{
	@Override
	public IteratorMap<T> iteratorMap(Map<T,Object> m) {
		return new IteratorMap<T>(m);
	}
	@Override
	public IteratorCollection<T> iteratorCollection(Collection<T> c) {
		return new IteratorCollection<T>(c);
	}
}