package com.koreait.memoList;

import java.util.Scanner;

public class MemoProjectMain {

	static MemoList memoList = new MemoList();

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int menu = 0;
		
		while (menu != 7) {
			while (true) {
				System.out.println("==========================================================================");
				System.out.println("1.입력  2.목록보기  3.수정  4.삭제  5.파일로 저장  6.파일에서 읽기  7.종료");
				System.out.println("==========================================================================");
				System.out.print("원하는 메뉴를 입력하세요: ");
				menu = scanner.nextInt();
				if (menu >= 1 && menu <= 7) {
					break;
				}
				System.out.println("메뉴는 1에서 7사이로 입력해야 합니다.");
				
			}
			
			switch (menu) {
				case 1:
					insert();
					break;
				case 2:
					System.out.println(memoList);;
					break;
				case 3:
					update();
					break;
				case 4:
					delete();
					break;
				case 5:
					fileWrite();
					break;
				case 6:
					fileRead();
					break;
			
			}
		
		}
		System.out.println("프로그램을 종료합니다.");
	}

//	키보드로 텍스트 파일 이름을 입력받아 텍스트 파일의 데이터를 읽어서 MemoList 클래스의 memoList라는 ArrayList에 저장한다.
	private static void fileRead() {
//		텍스트 파일 이름을 입력받는다.
		Scanner scanner = new Scanner(System.in);
		System.out.println("텍스트 파일 이름을 입력해주세요: ");
		String filename = scanner.nextLine().trim();
//		텍스트 파일의 데이터를 읽어 MemoList 클래스의 memoList라는 ArratList에 저장하는 메소드를 실행한다.
		memoList.readmemo(filename);
		System.out.println(filename + ".txt 파일에서 읽기완료");
		
	
	
	}

//	키보드로 텍스트 파일 이름을 입력받아 MemoList 클래스의 memoList라는 ArrayList에 저장된 데이터를 텍스트 파일로 출력한다.
	private static void fileWrite() {
//		텍스트 파일 이름을 입력받는다.
		Scanner scanner = new Scanner(System.in);
		System.out.println("텍스트 파일 이름을 입력해주세요: ");
		String filename = scanner.nextLine().trim();
//		 MemoList 클래스의 memoList라는 ArrayList에 저장된 데이터를 텍스트 파일로 출력하는 메소드를 실행한다.
		memoList.writememo(filename);
		
		
		System.out.println(filename + ".txt 파일에 쓰기완료");
	}

	private static void delete() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("삭제할 글번호를 입력해주세요: ");
		int idx = scanner.nextInt();
		MemoVO original = memoList.selectMemo(idx);
		
		if (original == null) {
			System.out.println(idx + "번 글이 존재하지 않습니다.");
		} else {
			System.out.println(original);
		}
		System.out.println("수정할 글의 비밀번호를 입력해주세요");
		scanner.nextLine();	
		String password = scanner.nextLine().trim();
		if (password.equals(original.getPassword())) {
			memoList.deleteMemo(idx);
			System.out.println("삭제 완료");
		} else {
			System.out.println("비밀번호가 일치하지 않습니다.");
		}
		
	}

	private static void update() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("수정할 글번호를 입력해주세요: ");
		int idx = scanner.nextInt();
		
		MemoVO original = memoList.selectMemo(idx);
		if (original == null) {
			System.out.println(idx + "번 글이 존재하지 않습니다.");
		} else {
			System.out.println(original);
			
			System.out.println("수정할 글의 비밀번호를 입력해주세요");
			scanner.nextLine();	
			String password = scanner.nextLine().trim();
			
			if (password.equals(original.getPassword())) {
				System.out.println("수정할 메모를 입력하세요: ");
				String memo = scanner.nextLine().trim();
				
				memoList.updateMemo(idx, memo);
				System.out.println("수정 완료");
			} else {
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
		}
	}

	private static void insert() {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("게시판에 저장할 글 입력");
		System.out.print("이름: ");
		String name = scanner.nextLine().trim();
		System.out.print("비밀번호: ");
		String password = scanner.nextLine().trim();
		System.out.print("메모: ");
		String memo = scanner.nextLine().trim();
		
		MemoVO vo = new MemoVO(name, password, memo);
		
		memoList.addMemo(vo);
		System.out.println("저장완료");
	}

}







