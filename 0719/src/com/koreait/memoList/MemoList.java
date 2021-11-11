package com.koreait.memoList;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class MemoList {
	
	ArrayList<MemoVO> memoList = new ArrayList<>();

	public ArrayList<MemoVO> getMemoList() {
		return memoList;
	}

	public void setMemoList(ArrayList<MemoVO> memoList) {
		this.memoList = memoList;
	}

	@Override
	public String toString() {

		String str = "";
		if (memoList.size() == 0) {
			str += "저장된 글이 없습니다.\n";
		} 
		for (int i = memoList.size() - 1; i >= 0 ; i--) {	// 마지막부터
			str += memoList.get(i) + "\n";
		}
		return str;
	}

	public void addMemo(MemoVO vo) {
		memoList.add(vo);
		
	}


	public MemoVO selectMemo(int idx) {
		try {
			return memoList.get(idx - 1);			
		} catch (IndexOutOfBoundsException e) {
			return null;
		}
	}

	public void updateMemo(int idx, String memo) {
		memoList.get(idx - 1).setMemo(memo);
		
	}

	public void deleteMemo(int idx) {
		memoList.remove(idx - 1);
		
		for (int i = 0; i < memoList.size(); i++) {
			memoList.get(i).setIdx(i + 1);
		}
		
		MemoVO.count = memoList.size();
		
	}

	public void writememo(String filename) {
		PrintWriter printWriter = null;
		
		try {
			String filePath = ".\\src\\com\\koreait\\memoList\\" + filename + ".txt";
//			System.out.println(filePath);
			printWriter = new PrintWriter(filePath);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd.hh.mm.ss");
//		memoList라는 ArrayList에 저장된 데이터의 개수만큼 반복하며 텍스트 파일로 출력한다.
			for (MemoVO vo : memoList) {
				String str = "";
				str += vo.getIdx() + " ";
				str += vo.getName() + " ";
				str += vo.getPassword() + " ";
				str += vo.getMemo().replace(" ", "_") + " ";
				str += sdf.format(vo.getWriteDate());
//				String str = String.format("%s %s %s %s", vo.getIdx(), vo.getName(), vo.getPassword(), vo.getMemo().replace(" ", "_"),
//						sdf.format(vo.getWriteDate()));
				printWriter.write(str + "\n");
			}
		} catch (FileNotFoundException e) {
//			e.printStackTrace();
			System.out.println("파일의 경로 또는 이름이 올바르지 않습니다.");
		} finally {
			if (printWriter != null) {
				printWriter.close();
			}
		}
		
	}

	
//	MemoProjectMain 클래스에서 호출되는 텍스트 파일 이름을 넘겨받아 텍스트 파일의 데이터를 읽어 memoList라는 ArrayList에 저장하는 메소드
	public void readmemo(String filename) {
		Scanner scanner = null;
		try {
			String filePath = ".\\src\\com\\koreait\\memoList\\" + filename +".txt";
			scanner = new Scanner(new File(filePath));
			
//			텍스트 파일에 저장된 데이터를 마지막 줄까지 읽어서 memoList라는 ArrayList에 저장한다.
			while(scanner.hasNextLine()) {
				String str = scanner.nextLine().trim();
//				텍스트 파일의 데이터를 1줄 읽어서 저장한 String 변수에서 공백을 경계로 데이터를 읽는다.
				Scanner scan = new Scanner(str);
				int idx = scan.nextInt();
				String name = scan.next();
				String password = scan.next();
				String memo = scan.next().replace("_", " ");
				String writeDate = scan.nextLine().trim();
				/*
//				memoList라는 ArratList에 저장하기 위해서 String 변수에서 읽어 각각의 변수에 저장한 데이터로 MemoVO 클래스 객체를 생성한다.
				MemoVO vo = new MemoVO();
				vo.setIdx(idx);
				vo.setName(name);
				vo.setPassword(password);
				vo.setMemo(memo);
				
//				작성일은 Date 클래스타입이므로 String 변수 writeDate에서 문자열을 substring() 메소드를 사용해서 년, 월, 일, 시, 분, 초로
//				분리한 후 날짜 데이터를 만들어 저장시켜야한다.
//				int year = Integer.parseInt(writeDate.substring(0, 4)) - 1900;
//				int month = Integer.parseInt(writeDate.substring(5, 7)) - 1;
//				int day = Integer.parseInt(writeDate.substring(8, 10));
//				int hour = Integer.parseInt(writeDate.substring(11, 13));
//				int minute = Integer.parseInt(writeDate.substring(14, 16));
//				int second = Integer.parseInt(writeDate.substring(17));
				
//				split() 메소드의 구분자를 "."으로 정하면 동작이 제대로 되지 않는다. 이럴경우 "\\." 나 "[.]" 형태로 지정하면 된다.
				String[] d = writeDate.split("\\.");
				int year = Integer.parseInt(d[0]) - 1900;
				int month = Integer.parseInt(d[1]) - 1;
				int day = Integer.parseInt(d[2]);
				int hour = Integer.parseInt(d[3]);
				int minute = Integer.parseInt(d[4]);
				int second = Integer.parseInt(d[5]);
				Date date = new Date(year, month, day, hour, minute, second);
				vo.setWriteDate(date);
				*/
				
//				MemoVO클래스 객체에 저장된 데이터를 memoList라는 ArrayList에 저장한다.
				MemoVO vo = new MemoVO(idx, name, password, memo, writeDate);
				memoList.add(vo);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("파일의 경로 또는 이름이 올바르지 않습니다.");
		} finally {
			if (scanner != null) {
				scanner.close();
			}
		}
			
		
	}
}



