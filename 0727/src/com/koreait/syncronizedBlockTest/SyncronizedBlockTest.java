package com.koreait.syncronizedBlockTest;

public class SyncronizedBlockTest {

	public static void main(String[] args) {

		ShareArea shareArea = new ShareArea();
		
		TransferThread transfer = new TransferThread(shareArea);
		transfer.start();

		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		PrintThread print = new PrintThread(shareArea);
		print.start();
		
	}

}
