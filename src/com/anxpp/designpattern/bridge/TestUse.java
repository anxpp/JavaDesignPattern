package com.anxpp.designpattern.bridge;
public class TestUse {
	public static void main(String args[]){
		Object data = "数据";
		ISaveData saveDataDb = new SaveToDB();
		ISaveData saveDataFile = new SaveToFile();
		AbstractSave save;
		save = new NetSave(saveDataDb);
		save.save(data);
		save = new NetSave(saveDataFile);
		save.save(data);
		save = new LocalSave(saveDataDb);
		save.save(data);
		save = new LocalSave(saveDataFile);
		save.save(data);
	}
}