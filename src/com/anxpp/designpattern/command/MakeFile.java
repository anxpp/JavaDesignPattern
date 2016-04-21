package com.anxpp.designpattern.command;
import java.io.File;
import java.io.IOException;
//接收者
public class MakeFile {
	//新建文件
	public void createFile(String name) throws IOException{
		File file = new File(name);
		file.createNewFile();
	}
	//删除文件
	public boolean deleteFile(String name){
		File file = new File(name);
		if(file.exists()&&file.isFile()){
			file.delete();
			return true;
		}
		return false;
	}
}