package com.koreait.threadTest;

public class JoinThread extends Thread{

	int start, end, total;
	public JoinThread() { }
	public JoinThread(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}
	@Override
	public void run() {
		for (int i = start; i <= end; i++) {
			total += i;
		}
	}
	
	
	
}
