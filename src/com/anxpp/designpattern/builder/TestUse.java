package com.anxpp.designpattern.builder;
public class TestUse {
	public static void main(String args[]){
		MyDate date = new MyDate();
		IDateBuilder builder;
		builder = new DateBuilder1(date).buildDate(2066, 3, 5);
		System.out.println(builder.date());
		builder = new DateBuilder2(date).buildDate(2066, 3, 5);
		System.out.println(builder.date());
	}
}