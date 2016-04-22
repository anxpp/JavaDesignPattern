package com.anxpp.designpattern.facade;
//计算优惠
public class Discount {
	int getDiscount(String discountCode){
		return Math.abs(discountCode.hashCode())%3;
	}
}
