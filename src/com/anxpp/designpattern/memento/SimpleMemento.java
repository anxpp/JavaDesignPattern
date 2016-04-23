package com.anxpp.designpattern.memento;
//简单的备忘录模式
public class SimpleMemento {
	public static void main(String[] args) throws Exception {
		Originator originator = new Originator();	//发起人，要被保存的对象,也是他创建要保存的信息的
		Caretaker caretaker = new Caretaker();		//辅助保存的对象
		originator.setState("stateOne");	//设置状态
		caretaker.saveMemento(originator.createMemento());		//保存状态
		originator.setState("stateTwo");	//修改状态
		originator.recoverMemento(caretaker.recoverMemento());	//恢复状态
	}
}
//发起人
class Originator {
	private String state;
	public Memento createMemento(){
		return new Memento(state);
	}
	public void recoverMemento(Memento memento){
		this.state = memento.getState();
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}
//备忘录
class Memento {
	private String state;
	public Memento(String state){
		this.state = state;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}
//负责人
class Caretaker {
	private Memento memento;
	public Memento recoverMemento() throws Exception{
		if(memento==null)
			throw new Exception("没有保存的状态");
		return this.memento;//恢复状态
	}
	public void saveMemento(Memento memento){
		this.memento = memento;//保存状态
	}
}