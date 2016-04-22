package com.anxpp.designpattern.visitor;
//普通用户，具体元素
public class UserOrdinary implements User{
	String estimation;
	public UserOrdinary(String estimation){
		this.estimation = estimation;
	}
	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}
	String getEstimation(){
		return estimation;
	}
}
