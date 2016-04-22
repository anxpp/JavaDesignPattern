package com.anxpp.designpattern.prototype;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
//使用Serializable支持克隆
public class SerializablePrototype implements Serializable{
	private static final long serialVersionUID = 1L;
	private int i;
	private transient int notClone;//transient关键字的成员不会被序列化
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public int getNotClone() {
		return notClone;
	}
	public void setNotClone(int notClone) {
		this.notClone = notClone;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public void writeToFile(String path) throws Exception{
		FileOutputStream outStream = new FileOutputStream(path);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(outStream);  
		objectOutputStream.writeObject(this);  
		outStream.close();
	}
	public SerializablePrototype ReadFromFile(String path) throws Exception{
		File file = new File(path);
		if(!file.exists())
			file.createNewFile();
		FileInputStream inStream = new FileInputStream(path);
		ObjectInputStream objectOutputStream = new ObjectInputStream(inStream);  
		Object o= objectOutputStream.readObject();  
		inStream.close();
		return (SerializablePrototype) o;
	}
	public static void main(String args[]) throws Exception{
		String path = "D:/SerializablePrototype.instance";
		SerializablePrototype prototype = new SerializablePrototype();
		prototype.setI(123);
		prototype.setNotClone(456);
		prototype.writeToFile(path);
		SerializablePrototype prototypeClone = new SerializablePrototype();
		prototypeClone = prototype.ReadFromFile(path);
		System.out.println(prototypeClone.getI() + " " + prototypeClone.getNotClone() + " ");
	}
}
