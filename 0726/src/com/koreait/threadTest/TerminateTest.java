package com.koreait.threadTest;

import java.util.Scanner;


public class TerminateTest {

	public static void main(String[] args) {
		
		TerminateThread threadA = new TerminateThread("A");
		TerminateThread threadB = new TerminateThread("B");
		TerminateThread threadC = new TerminateThread("C");
		
		threadA.start();
		threadB.start();
		threadC.start();
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("종료할 스레드 선택(A, B, C, M): ");
		while (true) {
			char in = scanner.nextLine().charAt(0);
			if (in == 'A') {
				threadA.setFlag(true);
			} else if (in == 'B') {
				threadB.setFlag(true);
			} else if (in == 'C') {
				threadC.setFlag(true);
			} else if (in == 'M'){
				threadA.setFlag(true);
				threadB.setFlag(true);
				threadC.setFlag(true);
				break;
			}
		}
	System.out.println("main end");
	}
}
