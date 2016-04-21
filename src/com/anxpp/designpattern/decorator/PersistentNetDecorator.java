package com.anxpp.designpattern.decorator;
//装饰--存入网络其他地方
public class PersistentNetDecorator extends PersistentDecorator {
	public PersistentNetDecorator(IPersistentUtil iPersistentUtil){
		super(iPersistentUtil);
	}
	@Override
	public void persistentMsg(String msg) {
		iPersistentUtil.persistentMsg(msg);
		persistentToNet(msg);
	}
	private void persistentToNet(String msg){
		System.out.println(msg + " 存入网络的其他地方");
	}
}