package com.koreait.syncronizedMethod;

public class SyncMain {

	public static Bank myBank = new Bank(); 
	
	
	public static void main(String[] args) {

		Lee lee = new Lee();
		lee.start();
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Hong hong = new Hong();
		hong.start();
	}

}
