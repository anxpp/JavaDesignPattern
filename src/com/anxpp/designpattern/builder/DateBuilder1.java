package com.anxpp.designpattern.builder;
//具体生成器
public class DateBuilder1 implements IDateBuilder{
	private MyDate myDate;
	public DateBuilder1(MyDate myDate){
		this.myDate = myDate;
	}
	@Override
	public IDateBuilder buildDate(int y, int m, int d) {
		myDate.date = y+"-"+m+"-"+d;
		return this;
	}
	@Override
	public String date() {
		return myDate.date;
	}
}
