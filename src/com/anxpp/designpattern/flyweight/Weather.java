package com.anxpp.designpattern.flyweight;
//具体享元
public class Weather implements IWeather{
	private String weather;
	private Integer temperature;
	public Weather(String weather,int temperature){
		this.weather = weather;
		this.temperature = temperature;
	}  
	@Override
	public void printWeather() {
		System.out.print("天气:" + weather);  
		System.out.println("  温度:" + temperature);  
	}
	@Override
	public boolean equals(Object obj) {
		Weather weather = (Weather)obj;
		return weather.weather.equals(this.weather)&&weather.temperature==temperature;
	}
	@Override
	public int hashCode() {
		return (weather.hashCode()+temperature.hashCode())/2;
	}
}