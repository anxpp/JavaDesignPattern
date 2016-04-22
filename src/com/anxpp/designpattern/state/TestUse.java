package com.anxpp.designpattern.state;
public class TestUse {
	public static void main(String args[]){
		String smallData = "小数据";
		String middleData = "介于小数据和大数据之间的数据";
		String bifgData = "这里就假定这是一个很大很大很大的数据";
		SaveDataController saveDataController = new SaveDataController();
		saveDataController.save(smallData);
		saveDataController.save(middleData);
		saveDataController.save(bifgData);
	}
}