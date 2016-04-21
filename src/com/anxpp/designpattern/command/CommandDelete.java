package com.anxpp.designpattern.command;
//删文件命令
public class CommandDelete implements Command{
	MakeFile makeFile;
	public CommandDelete(MakeFile makeFile) {
		this.makeFile = makeFile;
	}
	@Override
	public void execute(String name) throws Exception {
		makeFile.deleteFile(name);
	}
}
