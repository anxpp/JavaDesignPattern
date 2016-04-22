package com.anxpp.designpattern.iterator;
public class TestUse {
	public static void main(String args[]){
		//分别定义两种结构
		List<Integer> array = new ArrayList<Integer>();
		List<Integer> link = new LinkList<Integer>();
		//添加数据
		for(int i = 1;i < 8; i++){
			array.add(i);
			link.add(i);
		}
		//获得迭代器
		Iterator<Integer> ai = array.iterator();
		Iterator<Integer> li = array.iterator();
		//遍历并输出
		while(ai.hasNext())
			System.out.print(ai.next());
		System.out.println();
		while(li.hasNext())
			System.out.print(li.next());
	}
}