package com.anxpp.designpattern.visitor;
//抽象访问者
public interface Visitor {
	void visit(UserVIP user);
	void visit(UserOrdinary user);
}