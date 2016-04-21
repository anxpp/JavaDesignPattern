package com.anxpp.designpattern.Composite;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Folder implements Component {
	private String name;
	private List<Component> files;
	private List<Component> folders;
	public Folder(String name){
		this.name = name;
		files = new ArrayList<Component>();
		folders = new ArrayList<Component>();
	}
	@Override
	public void addFile(Component file) {
		files.add(file);
	}
	@Override
	public Component addFolder(Component folder) {
		folders.add(folder);
		return this;
	}
	@Override
	public void removeFile(Component file) {
		files.remove(file);
	}
	@Override
	public void removeFolder(Component folder) {
		folders.remove(folder);
	}
	@Override
	public List<Component> getFiles() {
		return files;
	}
	@Override
	public List<Component> getFolders() {
		return folders;
	}
	@Override
	public List<Component> getAll() {
		List<Component> all = new ArrayList<Component>(folders);
		all.addAll(files);
		return all;
	}
	@Override
	public Iterator<Component> iterator() {
		List<Component> all = new ArrayList<Component>();
		add(all,this);
		return all.iterator();
	}
	private void add(List<Component> all,Component component){
		if(component==null) return;
		all.add(component);
		Iterator<Component> iterator = component.getFolders().iterator();
		while(iterator.hasNext()){
			add(all,iterator.next());
		}
		all.addAll(component.getFiles());
	}
	@Override
	public void display() {
		System.out.println(name);
	}
}
