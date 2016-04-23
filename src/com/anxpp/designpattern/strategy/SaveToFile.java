package com.anxpp.designpattern.strategy;
//具体策略
public class SaveToFile implements ISaveData {
	@Override
	public void save(Object data) {
		System.out.println("数据：" + data + " 保存到文件");
	}
}
