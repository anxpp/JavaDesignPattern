package com.anxpp.designpattern.singleton;
/**
 * 简单的单例模式，不能用于多线程
 * @author Administrator
 *
 */
public class SimpleSingleton {
	private static SimpleSingleton instance;
	private SimpleSingleton(){}
	public static SimpleSingleton getIntance(){
		if(instance == null)
			instance = new SimpleSingleton();
		return instance;
	}
}
