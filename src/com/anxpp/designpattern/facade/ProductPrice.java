package com.anxpp.designpattern.facade;
//获取商品价格
public class ProductPrice {
	int getPrice(String product){
		return Math.abs(product.hashCode());//模拟获取商品价格
	}
}
