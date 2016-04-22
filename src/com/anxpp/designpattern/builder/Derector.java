package com.anxpp.designpattern.builder;
//指挥者
public class Derector {
	private IDateBuilder builder;
	public Derector(IDateBuilder builder){
		this.builder = builder;
	}
	public String getDate(int y,int m,int d){
		builder.buildDate(y, m, d);
		return builder.date();
	}
}
