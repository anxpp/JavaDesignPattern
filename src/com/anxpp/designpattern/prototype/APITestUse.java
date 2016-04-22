package com.anxpp.designpattern.prototype;
//使用 java 自带的支持
public class APITestUse {
	public static void main(String args[]) throws CloneNotSupportedException{
		MyObject myObject = new MyObject();
		myObject.i = 500;
		MyObject myObjectClone = (MyObject) myObject.clone();
		System.out.println(myObjectClone.i);
	}
}
class MyObject implements Cloneable{
	int i;
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}