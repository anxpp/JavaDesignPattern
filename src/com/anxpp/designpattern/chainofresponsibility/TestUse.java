package com.anxpp.designpattern.chainofresponsibility;
public class TestUse {
	public static void main(String args[]){
		Handler h1,h2,h3;
		h1 = new Handler1();
		h2 = new Handler2();
		h3 = new Handler3();
		h1.setNextHandler(h2);
		h2.setNextHandler(h3);
		System.out.println(h1.handleRequest(-1));
		System.out.println(h1.handleRequest(5));
		System.out.println(h1.handleRequest(9999));
	}
}