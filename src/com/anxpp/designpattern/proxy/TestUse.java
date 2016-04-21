package com.anxpp.designpattern.proxy;
public class TestUse {
	public static void main(String args[]){
		AbstractObject obj = new ProxyObject();
        obj.method1();
        obj.method2();
        obj.method3();
	}
}