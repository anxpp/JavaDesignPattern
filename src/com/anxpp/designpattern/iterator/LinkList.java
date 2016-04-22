package com.anxpp.designpattern.iterator;
//方便演示而实现的简陋的单向链表list
public class LinkList<T> implements List<T>{
	private int size;	//存放的元素个数,会默认初始化为0
	private Node<T> first;	//首节点，默认初始化为null
	@Override
	public Iterator<T> iterator() {
		return new MyIterator();
	}
	@Override
	public boolean add(T t) {
		if(size==0){
			first = new Node<T>(t,null);
		}
		while(first.next!=null);
		first.next = new Node<T>(t,null);
		return true;
	}
	//链表节点
	private static class Node<T>{
		T data;
		Node<T> next;
		Node(T data,Node<T> next){
			this.data = data;
			this.next = next;
		}
	}
	//遍历器
	private class MyIterator implements Iterator<T>{
		private Node<T> next;	//下一个节点
		MyIterator(){
			next = first;
		}
		@Override
		public boolean hasNext() {
			return next!=null;
		}
		@Override
		public T next() {
			T data = next.data;
			next = next.next;
			return data;
		}
	}
}