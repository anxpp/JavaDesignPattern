package com.anxpp.designpattern.decorator;

public class TestUse {
	public static void main(String args[]){
		//被装饰者
		final String data = "数据";
		IPersistentUtil iPersistentUtil = new PersistentUtil();
		iPersistentUtil.persistentMsg(data);
		System.out.println("下面装饰数据库持久化：");
		iPersistentUtil = new PersistentDbDecorator(iPersistentUtil);
		iPersistentUtil.persistentMsg(data);
		System.out.println("下面继续装饰网络存储器持久化：");
		iPersistentUtil = new PersistentNetDecorator(iPersistentUtil);
		iPersistentUtil.persistentMsg(data);
	}
}