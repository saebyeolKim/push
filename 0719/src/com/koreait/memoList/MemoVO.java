package com.koreait.memoList;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MemoVO {
	
	public static int count;	
	private int idx;			
	private String name;		
	private String password;	
	private String memo;		
	private Date writeDate;		
	
	public MemoVO() {
	}

	public MemoVO(String name, String password, String memo) {
		idx = ++count;
		this.name = name;
		this.password = password;
		this.memo = memo;
		writeDate = new Date();
	}


	public MemoVO(int idx, String name, String password, String memo, String writeDate) {
		this.idx = idx;
		this.name = name;
		this.password = password;
		this.memo = memo;
		int year = Integer.parseInt(writeDate.substring(0, 4)) - 1900;
		int month = Integer.parseInt(writeDate.substring(5, 7)) - 1;
		int day = Integer.parseInt(writeDate.substring(8, 10));
		int hour = Integer.parseInt(writeDate.substring(11, 13));
		int minute = Integer.parseInt(writeDate.substring(14, 16));
		int second = Integer.parseInt(writeDate.substring(17));
		Date date = new Date(year, month, day, hour, minute, second);
		this.writeDate = date;
	}

	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public Date getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}

	SimpleDateFormat df = new SimpleDateFormat("yyyy.MM.dd(E)");
	@Override
	public String toString() {
		return idx + ". " + name + "(" + password + ") 님이 " + df.format(writeDate) + "에 남긴글 \n" + memo;
	}
	
	

}
