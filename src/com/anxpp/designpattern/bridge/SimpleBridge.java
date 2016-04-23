package com.anxpp.designpattern.bridge;
//桥接模式
public class SimpleBridge {
	public static void main(String args[]){
		new LenevoComputer(new Amd()).discribe();
		new HaseeComputer(new Intel()).discribe();
	}
}
//实现者
interface Cpu{
	String discribe();
}
//具体实现者*2
class Amd implements Cpu{
	public String discribe() {
		return "just so so...";
	}
}
class Intel implements Cpu{
	public String discribe() {
		return "great !";
	}
}
//抽象
abstract class AbstractComputer{
	Cpu cpu;
	public AbstractComputer(Cpu cpu){
		this.cpu=cpu;
	}
	public abstract void discribe();

}
//细化抽象*2
class LenevoComputer extends AbstractComputer{
	public LenevoComputer(Cpu cpu) {
		super(cpu);
	}
	@Override
	public void discribe() {
		System.out.println("联想笔记本cpu:"+super.cpu.discribe());
	}
}
class HaseeComputer extends AbstractComputer{
	public HaseeComputer(Cpu cpu) {
		super(cpu);
	}
	@Override
	public void discribe() {
		System.out.println("神舟笔记本cpu:"+super.cpu.discribe());
	}
}