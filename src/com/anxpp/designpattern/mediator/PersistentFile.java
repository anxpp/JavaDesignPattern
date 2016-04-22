package com.anxpp.designpattern.mediator;
//具体同事
public class PersistentFile implements IPersistent{
	private Object data;
	@Override
	public void getData(Object data, Midiator midiator) {
		getData(data);
		midiator.notifyOther(this, data);
	}
	@Override
	public void saveData() {
		System.out.println(data + " 已保存到文件");
	}
	@Override
	public void getData(Object data) {
		this.data = data;
		saveData();
	}
}
