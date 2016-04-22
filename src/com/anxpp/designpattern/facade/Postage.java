package com.anxpp.designpattern.facade;
//计算邮费
public class Postage {
	int getPostage(String addr){
		return Math.abs(addr.hashCode())%20+6;//模拟邮费计算
	}
}
