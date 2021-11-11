package com.koreait.textfileio;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TexfileReadTest {

	public static void main(String[] args) {

		Scanner scanner = null;
//		String filename = ".\\src\\com\\koreait\\textfileio\\out.txt";	
//		텍스트 파일을 읽어오지 못할 경우 텍스트 파일을 다른이름으로 저장 실행해서 인코딩을 ANSI를 UTF-8로 변경한다.
//		String filename = ".\\src\\com\\koreait\\textfileio\\in.txt";	
		String filename = ".\\src\\com\\koreait\\textfileio\\input.txt";	
		
//		Scanner 클래스 객체를 만들 때 생성자의 인수로 "Scanner.in"을 넣어주면 키보드로 입력받는 스캐너가 만들어지고 생성자의 인수로 
//		String 변수를 넣어주면 String 변수에 저장된 내용을 읽어들이는 스캐너가 만들어 진다.
//		scanner = new Scanner(filename);
//		System.out.println(scanner.nextLine());
		
		try {
//			Scanner 클래스 객체를 생성해서 지정된 경로의 입력으로 사용할 파일을 open한다.
//			Scanner로 텍스트 파일을 읽어오러면 Scanner 클래스 생성자의 인수로 파일의 경로와 이름을 사용해서 File 클래스 객체를 생성해서
//			넘겨줘야한다.
			scanner = new Scanner(new File(filename));
			
//			텍스트 파일에서 더 이상 읽어들일 데이터(줄)가 없을 때까지 반복하며 읽어들인다.
//			hasNextLine(): Scanner로 지정된 파일에서 읽어들일 데이터가 있으면 true 없으면 false
			while(scanner.hasNextLine()) {
				String str = scanner.nextLine().trim();
				System.out.println(str);
				
				int i = 0;
				boolean b = false;
				double d = 0;
				String s = "";
	
//				String 변수에 저장된 문자열 데이터를 읽어들이는 스캐너
				Scanner scan = new Scanner(str);
//				hasNext(): Scanner로 지정된 String 변수에 저장된 공백으로 구분되는 읽어들일 데이터가 있으면 true, 없으면 false를 리턴한다.
				while(scan.hasNext()) {
					if (scan.hasNextInt()) {				// String 변수에서 읽어들일 데이터가 정수인가?
						i = scan.nextInt();						
					} else if (scan.hasNextBoolean()) {		// String 변수에서 읽어들일 데이터가 논리값인가?
						b = scan.nextBoolean();						
					} else if (scan.hasNextDouble()) {		// String 변수에서 읽어들일 데이터가 실수인가?
						d = scan.nextDouble();						
					} else {								// String 변수에서 읽어들일 데이터가 문자인가?
						s = scan.next();						
					}
				}
				
				System.out.println("i = " + i);
				System.out.println("b = " + b);
				System.out.println("d = " + d);
				System.out.println("s = " + s);
			}
			
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println("디스크에 파일이 존재하지 않습니다.");
		} finally {
//			입력 용도로 사용하는 파일은 파일을 닫지않아도 정상적으로 처리된다.
			if (scanner != null) {
				scanner.close();				
			}
		}
		
	}

}
