package com.anxpp.designpattern.factorymethod;

//便于介绍，不做多的操作
public interface List<T> {
	Iterator<T> iterator();	//返回一个遍历器
	boolean add(T t);		//添加元素到列表
}
