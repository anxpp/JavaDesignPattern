package com.anxpp.designpattern.proxy;
//代理对象
public class ProxyObject implements AbstractObject {
	AbstractObject object = new TargetObject();
	@Override
	public void method1() {
		object.method1();
	}
	@Override
	public int method2() {
		return object.method2();
	}
	@Override
	public void method3() {
		System.out.println("调用目标对象前的操作");
		object.method3();
		System.out.println("调用目标对象后的操作");
	}
}
