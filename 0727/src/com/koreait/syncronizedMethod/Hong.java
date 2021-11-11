package com.koreait.syncronizedMethod;

public class Hong extends Thread {

	@Override
	public void run() {
		System.out.println("start minus");
		SyncMain.myBank.minusMoney(1000);
		System.out.println("minusMoney(1000): " + SyncMain.myBank.getMoney());
	}
	

}
