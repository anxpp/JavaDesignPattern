package com.anxpp.designpattern.Observer;


public class TestUse {
	public static void main(String args[]){
		//创建主题
		WeatherService service = WeatherService.instance;
		//添加观察者
		service.addClient(new ClientAndroidServer());
		service.addClient(new ClientIphoneServer());
		//更新主题
		service.updateWeather(new WeatherInfo(System.currentTimeMillis(), "多云"));
		service.updateWeather(new WeatherInfo(System.currentTimeMillis()+1000*60*60*24, "多云转晴"));
		service.updateWeather(new WeatherInfo(System.currentTimeMillis()+1000*60*60*24*2, "晴"));
	}
}