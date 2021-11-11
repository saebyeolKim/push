package com.koreait.syncronizedMethod;

public class Lee extends Thread {

	@Override
	public void run() {
		System.out.println("start save");
		SyncMain.myBank.saveMoney(3000);
		System.out.println("saveMoney(3000): " + SyncMain.myBank.getMoney());
	}

	
	
}
