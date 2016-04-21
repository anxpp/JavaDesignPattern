package com.anxpp.designpattern.templatemethod;
//具体模板
public class Template extends AbstractTemplate {
	@Override
	void getData() {
		data = "data";
	}
	@Override
	void calcData() {
		data = (String)data+data;
	}
}