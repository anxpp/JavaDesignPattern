package com.anxpp.designpattern.chainofresponsibility;
//第二个具体处理者，处理>=0但小于10的
public class Handler2 implements Handler {
	private Handler next;
	@Override
	public int handleRequest(int n) {
		if(n<10) return n*n;
		else{
			if(next==null)
				throw new NullPointerException("next 不能为空");
			return next.handleRequest(n);
		}
	}
	@Override
	public void setNextHandler(Handler next) {
		this.next = next;
	}
}
