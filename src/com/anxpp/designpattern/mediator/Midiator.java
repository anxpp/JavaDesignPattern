package com.anxpp.designpattern.mediator;
//具体中介者
public class Midiator {
	PersistentDB persistentDB;
	PersistentFile persistentFile;
	public Midiator setPersistentDB(PersistentDB persistentDB) {
		this.persistentDB = persistentDB;
		return this;
	}
	public Midiator setPersistentFile(PersistentFile persistentFile) {
		this.persistentFile = persistentFile;
		return this;
	}
	public void notifyOther(IPersistent persistent,Object data){
		if(persistent instanceof PersistentDB)
			persistentFile.getData(data);
		if(persistent instanceof PersistentFile)
			persistentDB.getData(data);
	}
}
