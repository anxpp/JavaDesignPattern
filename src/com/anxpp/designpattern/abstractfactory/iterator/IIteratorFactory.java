package com.anxpp.designpattern.abstractfactory.iterator;
import java.util.Collection;
import java.util.Map;
//抽象工厂
public interface IIteratorFactory<T> {
	IIterator<T> iteratorMap(Map<T,Object> m);
	IIterator<T> iteratorCollection(Collection<T> c);
}