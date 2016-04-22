package com.anxpp.designpattern.prototype;
//具体原型
public class SimplePrototype implements Prototype,Cloneable {
	int value;
	//clone()实现
	@Override
	public Object cloneSelf() {
		SimplePrototype self = new SimplePrototype();
		self.value = value;
		return self;
	}
	//使用
	public static void main(String args[]){
		SimplePrototype simplePrototype = new SimplePrototype();
		simplePrototype.value = 500;
		SimplePrototype simplePrototypeClone = (SimplePrototype) simplePrototype.cloneSelf();
		System.out.println(simplePrototypeClone.value);
	}
}
//抽象原型
interface Prototype{
    Object cloneSelf();//克隆自身的方法
}
//客户端使用
class Client{
	SimplePrototype prototype;
	public Client(SimplePrototype prototype){
		this.prototype = prototype;
	}
	public Object getPrototype(){
		return prototype.cloneSelf();
	}
}