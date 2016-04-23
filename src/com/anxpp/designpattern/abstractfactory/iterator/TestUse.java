package com.anxpp.designpattern.abstractfactory.iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
//测试使用
public class TestUse {
	public static void main(String args[]){
		IIteratorFactory<Integer> factory = new IteratorFactory<>();
		Collection<Integer> collection = new ArrayList<Integer>();
		Map<Integer, Object> map = new LinkedHashMap<>();
		for(int i=0;i<10;i++){
			collection.add(i);
			map.put(i, i);
		}
		IIterator<Integer> iteratorCollection = factory.iteratorCollection(collection);
		IIterator<Integer> iteratorMap = factory.iteratorMap(map);
		while(iteratorCollection.hasNext())
			System.out.print(iteratorCollection.next());
		System.out.println();
		while(iteratorMap.hasNext())
			System.out.print(iteratorMap.next());
	}
}