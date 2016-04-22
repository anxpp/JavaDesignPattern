package com.anxpp.designpattern.mediator;
//具体同事
public class PersistentDB implements IPersistent{
	private Object data;
	@Override
	public void getData(Object data, Midiator midiator) {
		getData(data);
		midiator.notifyOther(this, data);
	}
	@Override
	public void saveData() {
		System.out.println(data + " 已保存到数据库");
	}
	@Override
	public void getData(Object data) {
		this.data = data;
		saveData();
	}
}
