package com.koreait.networkTest2;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client2 {

	public static void main(String[] args) {

		Socket socket = null;
		PrintWriter printWriter = null;
		Scanner scanner = null;				// 서버에서 전송되는 메시지를 읽는 스캐너
		Scanner scan = null;				// 키보드로 서버로 전송할 데이터를 입력받는 스캐너
		
		try {
			socket = new Socket("192.168.1.4", 10004);
			System.out.println("192.168.1.4 서버의 10004번 포트로 접속합니다.");
			System.out.println("접속 성공: " + socket);
			
//			송수신에 사용할 객체들을 선언한다.
			printWriter = new PrintWriter(socket.getOutputStream());
			scanner = new Scanner(socket.getInputStream());
			scan = new Scanner(System.in);
			
//			서버에서 넘어온 접속 메시지를 출력한다.
			System.out.println(scanner.nextLine());
			
//			키보드로 입력한 메시지 또는 서버에서 전송받은 메시지가 "BYE"면 통신을 끝낸다.
			String msg = "";
			do {
//				서버로 전송할 메시지를 입력받는다.
				System.out.println("client >> ");
				msg = scan.nextLine();
//				키보드로 입력받은 메시지를 서버로 전송한다.
				printWriter.write(msg + "\n");
				printWriter.flush();
//				키보드로 입력한 메시지가 "BYE"면 통신을 끝낸다 => do ~ while반복을 탈출한다.
				if (msg.toUpperCase().equals("BYE")) {
					break;
				}
//				=============================================================================
//				서버에서 전송받은 메시지를 출력한다.
				msg = scanner.nextLine().trim();
				System.out.println("server >> " + msg);
			} while (!msg.toUpperCase().equals("BYE"));
			System.out.println("서버와의 채팅을 종료합니다.");
				
			 
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (socket != null) {try {socket.close();} catch (IOException e) {e.printStackTrace();}}
		}
		
	}

}
