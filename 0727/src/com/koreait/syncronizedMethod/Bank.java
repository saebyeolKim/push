package com.koreait.syncronizedMethod;

public class Bank {

	private int money = 10000;

	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
//	동기화 메소드 => synchronized 예약어를 사용해서 선언한다.
//	메소드가 실행하는 모든 내용이 종료될 때 까지 다른 스레드가 실행되지 않도록 한다.
	public synchronized void saveMoney(int save) {
		int m = money;
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		money = m + save;
	}
	
	public synchronized void minusMoney(int minus) {
		int m = money;
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		money = m - minus;
	}
}
