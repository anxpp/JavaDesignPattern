package com.anxpp.designpattern.mediator;
//同事（接口）
public interface IPersistent {
	void getData(Object data);
	void getData(Object data,Midiator midiator);
	void saveData();
}