package com.anxpp.designpattern.decorator;
//具体的被装饰者
public class PersistentUtil implements IPersistentUtil{
	@Override
	public void persistentMsg(String msg) {
		System.out.println(msg + " 存入文件");
	}
}