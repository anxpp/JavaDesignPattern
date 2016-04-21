package com.anxpp.designpattern.decorator;
//装饰
public abstract class PersistentDecorator implements IPersistentUtil {
	IPersistentUtil iPersistentUtil;
	public PersistentDecorator(IPersistentUtil iPersistentUtil){
		this.iPersistentUtil = iPersistentUtil;
	}
	@Override
	public void persistentMsg(String msg) {
		iPersistentUtil.persistentMsg(msg);
	}
}
