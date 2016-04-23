package com.anxpp.designpattern.strategy;
//环境
public class SaveClient {
	private ISaveData saveData;
	public SaveClient(ISaveData saveData){
		this.saveData = saveData;
	}
	public void setSaveData(ISaveData saveData){
		this.saveData = saveData;
	}
	public void save(Object data){
		saveData.save(data);
	}
}
