package com.anxpp.designpattern.command;
//新建文件命令
public class CommandCreate implements Command {
	MakeFile makeFile;
	public CommandCreate(MakeFile makeFile) {
		this.makeFile = makeFile;
	}
	@Override
	public void execute(String name) throws Exception {
		makeFile.createFile(name);
	}
}
