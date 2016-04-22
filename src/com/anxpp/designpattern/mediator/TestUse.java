package com.anxpp.designpattern.mediator;
public class TestUse {
	public static void main(String args[]){
		Object data = "数据";
		PersistentDB persistentDB = new PersistentDB();
		PersistentFile persistentFile = new PersistentFile();
		Midiator midiator = new Midiator();
		midiator.setPersistentDB(persistentDB).setPersistentFile(persistentFile);
		persistentDB.getData(data, midiator);
		persistentFile.getData(data, midiator);
	}
}