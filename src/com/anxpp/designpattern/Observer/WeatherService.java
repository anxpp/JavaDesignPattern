package com.anxpp.designpattern.Observer;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
//主题，同时使用了枚举实现单例
public enum WeatherService implements IWeatherService{
	instance;
	private LinkedList<WeatherInfo> weatherInfos = new LinkedList<WeatherInfo>();
	private LinkedHashSet<Client> clients = new LinkedHashSet<Client>();	//存放观察者
	//添加观察者
	@Override
	public void addClient(Client client) {
		clients.add(client);
	}
	//删除观察者
	@Override
	public boolean deleteClient(Client client) {
		return clients.remove(client);
	}
	//通知观察者
	@Override
	public void notifyClients() {
		Iterator<Client> iterator = clients.iterator();
		while(iterator.hasNext()){
			iterator.next().getWeather(weatherInfos.peekFirst());
		}
	}
	//更新天气
	@Override
	public void updateWeather(WeatherInfo info) {
		if(weatherInfos.size()>0)
			if(weatherInfos.peekFirst().equals(info)) return;
		weatherInfos.push(info);
		if(clients.size()==0) return;
		notifyClients();
	}
}
