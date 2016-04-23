package com.anxpp.designpattern.strategy;
public class TestUse {
	public static void main(String args[]){
		Object data = "数据";
		ISaveData saveData = new SaveToRedis();
		SaveClient client = new SaveClient(saveData);
		client.save(data);
		client.setSaveData(new SaveToFile());
		client.save(data);
	}
}