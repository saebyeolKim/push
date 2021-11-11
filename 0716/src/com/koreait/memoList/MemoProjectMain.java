package com.koreait.memoList;

import java.util.Scanner;

public class MemoProjectMain {

//	클래스 내부의 모든 메소드에서 사용할 객체나 변수는 멤버로 선언한다.
	static MemoList memoList = new MemoList();

	public static void main(String[] args) {
		
//		MemoVO memo = new MemoVO("홍길동", "1111", "1등입니다.");
//		System.out.println(memo);
//		MemoVO memo2 = new MemoVO("임꺽정", "2222", "2등입니다.");
//		System.out.println(memo2);
//		MemoVO memo3 = new MemoVO("장길산", "3333", "3등입니다.");
//		System.out.println(memo3);
		
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
			
//		여기까지 왔다면 menu에는 1 ~ 7 사이의 숫자가 입력되었다는 의미이다.
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
					System.out.println("파일로 저장");
					break;
				case 6:
					System.out.println("파일에서 읽기");
					break;
			
			}
		
		}
		System.out.println("프로그램을 종료합니다.");
	}

//	키보드로 삭제할 글번호를 입력받아 삭제할 글 1건을 화면에 표시하고 비밀번호와 수정할 내용을 입력받아 
//	memoList라는 ArrayList에 저장된 글 1건을 삭제한다.
	private static void delete() {
//		키보드로 삭제할 글 번호를 입력받는다.
		Scanner scanner = new Scanner(System.in);
		System.out.print("삭제할 글번호를 입력해주세요: ");
		int idx = scanner.nextInt();
//		MemoList클래스에 memoList라는 ArrayList에 저장된 삭제할 글 1건을 얻어오는 메소드를 실행해서 얻어온 결과를
//		MemoVO 클래스 객체에 저장한다.
		MemoVO original = memoList.selectMemo(idx);
		
//		삭제할 글이 존재하면 글을 삭제하고 존재하지 않으면 존재하지 않는다고 메시지를 출력한다.
		if (original == null) {
			System.out.println(idx + "번 글이 존재하지 않습니다.");
		} else {
			System.out.println(original);
		}
		System.out.println("수정할 글의 비밀번호를 입력해주세요");
		scanner.nextLine();		// 키보드 버퍼를 비운다.
		String password = scanner.nextLine().trim();
		if (password.equals(original.getPassword())) {
			memoList.deleteMemo(idx);
			System.out.println("삭제 완료");
		} else {
//			비밀번호가 일치하지 않기 때문에 비밀번호가 일치하지 않는다는 메시지를 출력한다.
			System.out.println("비밀번호가 일치하지 않습니다.");
		}
		
	}

//	키보드로 수정할 글번호를 입력받아 수정할 글 1건을 화면에 표시하고 비밀번호와 수정할 내용을 입력받아 
//	memoList라는 ArrayList에 저장된 글 1건을 수정한다.
	private static void update() {
//		키보드로 수정할 글번호를 입력받는다
		Scanner scanner = new Scanner(System.in);
		System.out.print("수정할 글번호를 입력해주세요: ");
		int idx = scanner.nextInt();
		
//		MemoList클래스에 memoList라는 ArrayList에 저장된 수정할 글 1건을 얻어오는 메소드를 실행해서 얻어온 결과를
//		MemoVO 클래스 객체에 저장한다.
		MemoVO original = memoList.selectMemo(idx);
		if (original == null) {
			System.out.println(idx + "번 글이 존재하지 않습니다.");
		} else {
			System.out.println(original);
			
//			수정할 글의 비밀번호를 입력받는다.
			System.out.println("수정할 글의 비밀번호를 입력해주세요");
			scanner.nextLine();		// 키보드 버퍼를 비운다.
			String password = scanner.nextLine().trim();
			
//			글을 수정하기 위해 입력한 비밀번호(password)와 수정할 글의 비밀번호(original.getPassword())가 일치하면 글을 수정하고 일치하지 않으면 비밀번호가
//			일치하지 않는다는 메시지를 출력한다.
			if (password.equals(original.getPassword())) {
//				비밀번호가 일치하므로 MemoList 클래스의 memoList라는 ArrayList에 저장된 글 1건을 수정한느 메소드를 실행한다.
//				비밀번호가 일치하므로 수정할 메모를 입력받는다.
				System.out.println("수정할 메모를 입력하세요: ");
				String memo = scanner.nextLine().trim();
				
//				메모를 수정하는 메소드를 실행한다.
				memoList.updateMemo(idx, memo);
				System.out.println("수정 완료");
			} else {
//				비밀번호가 일치하지 않기 때문에 비밀번호가 일치하지 않는다는 메시지를 출력한다.
				System.out.println("비밀번호가 일치하지 않습니다.");
			}
		}
	}

//	키보드로 이름, 비밀번호, 메모를 입력받아 MemoVO 클래스 객체에 저장한다.
	private static void insert() {
		
//		키보드로 이름, 비밀번호, 메모를 입력받는다.
		Scanner scanner = new Scanner(System.in);
		System.out.println("게시판에 저장할 글 입력");
		System.out.print("이름: ");
		String name = scanner.nextLine().trim();
		System.out.print("비밀번호: ");
		String password = scanner.nextLine().trim();
		System.out.print("메모: ");
		String memo = scanner.nextLine().trim();
		
//		MmoeVO 클래스의 public MemoVO(String name, String password, String memo) 생성자를 실행해서 
//		MemoVO 클래스 객체를 생성한다.
		MemoVO vo = new MemoVO(name, password, memo);
//		System.out.println(vo);
		
//		MemoVO 클래스 객체를 인수로 넘겨받아 MemoList 클래스의 memoList라는 ArrayList에 저장하는 메소드 호출
		memoList.addMemo(vo);
		System.out.println("저장완료");
//		System.out.println(memoList);
	}

}







