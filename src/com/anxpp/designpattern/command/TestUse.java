package com.anxpp.designpattern.command;
public class TestUse {
	public static void main(String args[]) throws Exception{
		//接收者
		MakeFile makeFile = new MakeFile();
		//命令
		CommandCreate create = new CommandCreate(makeFile);
		CommandDelete delete = new CommandDelete(makeFile);
		//请求者
		Client client = new Client();
		//执行命令
		client.setCommand(create).executeCommand("d://test1.txt");
		client.setCommand(create).executeCommand("d://test2.txt");
		client.setCommand(delete).executeCommand("d://test2.txt");
	}
}