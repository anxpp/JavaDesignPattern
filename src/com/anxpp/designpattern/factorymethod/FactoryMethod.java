package com.anxpp.designpattern.factorymethod;
//工厂方法模式
public class FactoryMethod {
	public static void main(String args[]){
		IFactory bigfactory;
		bigfactory = new SmallFactory();
		bigfactory.produce().run();
		bigfactory = new BigFactory();
		bigfactory.produce().run();
	}
}
//抽象产品
interface MeizuPhone{
	void run();
}
//具体产品*2
class PRO5 implements MeizuPhone{
	@Override
	public void run() {
		System.out.println("我是一台PRO5");
	}
}
class MX5 implements MeizuPhone{
	@Override
	public void run() {
		System.out.println("我是一台MX5");
	}
}
interface IFactory{
	MeizuPhone produce();
}
//工厂*2
class BigFactory implements IFactory{
	@Override
	public MeizuPhone produce() {
		return new PRO5();
	}
}
class SmallFactory implements IFactory{
	@Override
	public MeizuPhone produce() {
		return new MX5();
	}
}