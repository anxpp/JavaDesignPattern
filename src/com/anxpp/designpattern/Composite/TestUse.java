package com.anxpp.designpattern.Composite;
import java.util.Iterator;
public class TestUse {
	public static void main(String args[]){
		Component root = new Folder("root");//根目录
		Component folder1 = new Folder("java");
		Component folder2 = new Folder("c++");
		Component folder3 = new Folder("c#");
		Component file1 = new File("info.txt");
		root.addFolder(folder1).addFolder(folder2).addFolder(folder3).addFile(file1);//添加一级目录
		folder1.addFile(new File("info.java"));
		Iterator<Component> iterator = root.iterator();
		while(iterator.hasNext()){
			Component component = iterator.next();
			if(component instanceof Folder)
				System.out.print("folder：");
			else
				System.out.print("file：");
			component.display();
		}
	}
}