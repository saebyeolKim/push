package com.koreait.textfileio;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TextFileWriteTest {

	public static void main(String[] args) {

		Scanner scanner = null;			// 텍스트 파일로 저장할 데이터를 입력 받는 Scanner
		PrintWriter printWriter = null;	// 텍스프 파일에 데이터를 저장하는 PrintWriter를 선언한다.
		
//		출력 파일의 경로와 이름을 설정한다.
//		경로 지정 방식은 절대경로 지정방식과 상대경로 지정방식이 있다.
//		절대경로는 작업중인 파일이 위치한 디스크 드라이브의 최상위(root) 폴더(디렉토리)부터 파일이 위치한 폴더까지의 경로를 의미한다.
//		상대경로는 작업중인 파일이 포함된 프로젝드 이름의 폴더(".")부터 작업중인 파일이 위치한 폴더까지의 경로를 의미한다.
//		python이나 c/c++의 "."은 화면에 열려있는 파일이 위치한 폴더를 의미하지만 java에서 "."은 작업중인 파일이 포함된 프로젝토 이름의
//		폴더를 의미한다.
//		경로 지정시 경로와 경로 또는 경로와 파일을 구분하는 "\"는 에러가 발생되면 "\\" 나 "/" 로 변경한다.
//		이클립스 버전이 올라가면서 경로를 복사해 큰 따옴표 안에 붙여 넣으면 자동으로 "\"가 "\\"로 변경된다.
		
//		String filename = "C:\\kookgi2\\java\\workspace\\0719\\src\\com\\koreait\\textfileio\\out.txt";		// 절대경로
//		String filename = "C:/kookgi2/java/workspace/0719/src/com/koreait/textfileio/out.txt";				// 절대경로	
		String filename = ".\\src\\com\\koreait\\textfileio\\out.txt";		// 상대경로
//		String filename = "./src/com/koreait/textfileio/out.txt";			// 상대경로	
		
		try {
			printWriter = new PrintWriter(filename);
			scanner = new Scanner(System.in);
			
//			"Quit"가 입력될 때 까지 반복하며 키보드로 입력받은 데이터를 파일에 저장한다.
			while (true) {
				System.out.print(">>>>");
				String str = scanner.nextLine().trim();
//				"QUit"가 입력되면 무한루프를 탈출시킨다.
				if (str.toUpperCase().equals("QUIT")) {
					break;
				}
				
				if (str.length() != 0) {
//					write() 메소드를 사용해서 printWriter클래스 객체로 생성한 파일로 출력한다.
//					write() 메소드로 출력할 때 "\n"을 입력했는데 텍스트 파일에서 줄이 변경되지 않으면 "\r\n"을 사용한다.
//					\n: new line, 줄을 바꾼다.
//					\r: carriage return, 커서를 줄의 맨 앞으로 보낸다.
					printWriter.write(str + "\n");
				}
			}
			System.out.println("저장완료");
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println("디스크에 파일이 존재하지 않습니다.");
		} finally {
//			출력 용도로 사용하는 파일은 출력 작업이 완료되면 반드시 파일을 닫아야 정상적으로 처리된다.
			if (printWriter != null) {
				printWriter.close();				
			}
		}
		
		
		
	}

}
