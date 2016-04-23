package com.anxpp.designpattern.flyweight;
import java.util.HashMap;
//简单的享元模式
public class SimpleFlyweight {
	public static void main(String args[]){
		FlyweightFactory factory = new FlyweightFactory();
		IFlyweight flyweight1,flyweight2,flyweight3,flyweight4;
		flyweight1 = factory.getFlyweight("value1");
		flyweight2 = factory.getFlyweight("value1");
		flyweight3 = factory.getFlyweight("value1");
		flyweight4 = factory.getFlyweight("value2");
		flyweight1.doSomething();
		flyweight2.doSomething();
		flyweight3.doSomething();
		flyweight4.doSomething();
		System.out.println(factory.size());
	}
}
//享元接口
interface IFlyweight{
	void doSomething();
}
//具体享元
class Flyweight implements IFlyweight{
	private String value;
	public Flyweight(String value){
		this.value = value;
	}
	@Override
	public void doSomething() {
		System.out.println(value);
	}
}
//享元工厂
class FlyweightFactory{
	HashMap<String, IFlyweight> flyweights = new HashMap<String, IFlyweight>();
	IFlyweight getFlyweight(String value){
		IFlyweight flyweight = flyweights.get(value);
		if(flyweight == null){
			flyweight = new Flyweight(value);
			flyweights.put(value, flyweight);
		}
		return flyweight;
	}
	public int size(){
		return flyweights.size();
	}
}