package com.anxpp.designpattern.Observer;
//天气的消息实体
public class WeatherInfo {
	private long time;
	private String weather;
	public WeatherInfo(long time,String weather){
		this.time = time;
		this.weather = weather;
	}
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	public String getWeather() {
		return weather;
	}
	public void setWeather(String weather) {
		this.weather = weather;
	}
	@Override
	public boolean equals(Object obj) {
		WeatherInfo info = (WeatherInfo) obj;
		return info.time==this.time&&info.weather.equals(this.weather);
	}
}
