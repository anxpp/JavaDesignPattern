package com.anxpp.designpattern.Composite;

import java.util.Iterator;
import java.util.List;
//Leaf节点
public class File implements Component{
	private String name;
	public File(String name){
		this.name = name;
	}
	@Override
	public void addFile(Component file) {}
	@Override
	public Component addFolder(Component folder) { return null; }
	@Override
	public void removeFile(Component file) {}
	@Override
	public void removeFolder(Component folder) {}
	@Override
	public List<Component> getFiles() { return null; }
	@Override
	public List<Component> getFolders() { return null; }
	@Override
	public List<Component> getAll() { return null; }
	@Override
	public Iterator<Component> iterator() { return null; }
	@Override
	public void display() {
		System.out.println(name);
	}
}
