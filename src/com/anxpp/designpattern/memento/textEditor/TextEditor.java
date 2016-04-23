package com.anxpp.designpattern.memento.textEditor;

import java.util.LinkedList;

//文本编辑器
public class TextEditor {
	public static void main(String[] args) {
		//使用这个文本编辑器
		MyTextEditor editor = new MyTextEditor("这里是初始文本，可能为文件中读取的值。");
		System.out.println("开始修改文本：");
		editor.append("添加文字1");
		editor.delWords();		//删除最后一个
//		editor.delWords(2);		//删除最后2个	这两个方法是没有问题的，这里避免控制台输出太多，取消这两次修改
//		editor.delWords(1,5);	//删除前面5个
		System.out.println("开始恢复：");
		for(int i=0;i<10;i++) editor.recoverMemento();//恢复大于实际修改的次数不会出错，只会将文本设为o初始化状态
		System.out.println("开始重做：");
		for(int i=0;i<10;i++) editor.redo();		//重做大于实际恢复的次数不会出错，只会将文本设为最后状态
		System.out.println("再次恢复：");
		for(int i=0;i<10;i++) editor.recoverMemento();//恢复大于实际修改的次数不会出错，只会将文本设为o初始化状态
		System.out.println("再次重做：");
		for(int i=0;i<10;i++) editor.redo();		//重做大于实际恢复的次数不会出错，只会将文本设为最后状态
		System.out.println("再次恢复：");
		for(int i=0;i<10;i++) editor.recoverMemento();//恢复大于实际修改的次数不会出错，只会将文本设为o初始化状态
		editor.append("添加文字2");
		System.out.println("再次重做：");
		for(int i=0;i<10;i++) editor.redo();		//重做大于实际恢复的次数不会出错，只会将文本设为最后状态
	}
}
interface IMemento {}
//发起人兼负责人
class MyTextEditor {
	public StringBuffer text;
	private LinkedList<IMemento> mementos;	//保存快照
	private LinkedList<IMemento> undos;		//保存撤销的操作
	public MyTextEditor(){
		this("");
	}
	public MyTextEditor(String defaultStr){
		text = new StringBuffer(defaultStr);
		mementos = new LinkedList<IMemento>();
		undos = new LinkedList<IMemento>();
		print();
	}
	public void clearHistory(){
		mementos.clear();
		undos.clear();
	}
	public void append(String appendStr){
		if(appendStr==null||appendStr.length()==0) return;
		createMemento();
		text.append(appendStr);
		print();
		undos.clear();
	}
	//删除最后一个
	public void delWords(){
		delWords(1);
	}
	//删除最后n个
	public void delWords(int n){
		if(n<1||n>text.length()) return;
		delWords(text.length()-n+1,text.length());
	}
	//删除中间start到end的字符,第一个文字为第一个(而不是0)
	public void delWords(int start,int end){
		if(start<1 || end>text.length()+1) return;
		createMemento();
		text = text.delete(start-1, end);
		print();
	}
	public void reset(String text){
		this.text = new StringBuffer(text);
	}
	//新的快照
	public void createMemento(){
		mementos.push(new Memento(this));
	}
	//恢复状态
	public boolean recoverMemento(){
		Memento memento = (Memento) mementos.poll();
		if(memento==null) return false;
		undos.push(new Memento(this));
		reset(memento.state);
		print();
		return true;
	}
	//redo,redo的操作也可以恢复！
	public boolean redo(){
		Memento memento = (Memento) undos.poll();
		if(memento==null) return false;
		createMemento();
		reset(memento.state);
		print();
		return true;
	}
	//内部类实现备忘录
	private class Memento implements IMemento{
		private String state;
		private Memento(MyTextEditor editor){
			this.state = editor.text.toString();
		}   
	}
	void print(){
		System.out.println("当前文本：" + text);
	}
}