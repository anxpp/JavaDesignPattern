package com.anxpp.designpattern.visitor;

public class MultiDispatch {
	public static void main(String args[]){
		Father child = new Child();
		child.print();
		new Child().print(new Vistor());
	}
}
class Father{
	void print(){
		System.out.println("父类");
	}
}
class Child extends Father{
	void print(){
		System.out.print("子类");
	}
	void print(Vistor c){
		c.print(this);
	}
}
class Vistor {  
    public void print(Child child){  
    	child.print();
    }
}