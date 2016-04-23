package com.anxpp.designpattern.memento;
//自述历史备忘录
public class MementoSelf {
	public static void main(String[] args) {
		OriginatorCaretaker originatorCaretaker = new OriginatorCaretaker();//发起人，同时为负责人
		originatorCaretaker.changeState("stateOne");	//改变状态
		IMemento memento = originatorCaretaker.createMemento();	//保存状态
		originatorCaretaker.changeState("stateTwo");	//改变状态
		originatorCaretaker.recoverMemento(memento);	//恢复状态
	}
}
interface IMemento {}
//发起人兼负责人
class OriginatorCaretaker {
	public String state;
	public void changeState(String state){
		this.state = state;
	}
	//创造快照
	public Memento createMemento(){
		return new Memento(this);
	}
	//恢复状态
	public void recoverMemento(IMemento memento){
		Memento m = (Memento)memento;
		changeState(m.state);
	}
	//内部类实现备忘录
	private class Memento implements IMemento{
		private String state;
		private Memento(OriginatorCaretaker originatorCaretaker){
			this.state = originatorCaretaker.state;
		}   
	}
}