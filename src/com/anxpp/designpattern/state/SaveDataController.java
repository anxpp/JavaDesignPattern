package com.anxpp.designpattern.state;
//环境（Context）
public class SaveDataController {
	private ISaveData saveData;
	public void save(String data){
		//为了演示，此处的大的数据其实也是很小的
		if(data.length()<1<<2)
			saveData = SaveSmallData.instance;
		else if(data.length()<1<<4)
			saveData = SaveMiddleData.instance;
		else
			saveData = SaveBigData.instance;
		saveData.save(data);
	}
}
