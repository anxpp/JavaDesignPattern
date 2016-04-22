package com.anxpp.designpattern.iterator;

//只是需要遍历一堆数据，那么只需要2个方法就可以了
public interface Iterator<T> {
	boolean hasNext();	//是否还有下一个元素
	T next();			//得到下一个元素
}
